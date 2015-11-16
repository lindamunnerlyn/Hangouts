// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.libraries.hangouts.video.DecoderManager;
import com.google.android.libraries.hangouts.video.EncoderManager;
import com.google.android.libraries.hangouts.video.Libjingle;
import com.google.android.libraries.hangouts.video.MediaSources;
import com.google.android.libraries.hangouts.video.NamedSource;
import com.google.android.libraries.hangouts.video.RendererManager;
import com.google.android.libraries.hangouts.video.Stats;
import com.google.android.libraries.hangouts.video.VideoViewRequest;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.webrtc.voiceengine.AudioEffectsJB;
import org.webrtc.voiceengine.WebRtcAudioRecord;
import org.webrtc.voiceengine.WebRtcAudioUtils;

final class geg
    implements ggi
{

    private static final long E;
    private static final long z;
    private final Runnable A;
    private boolean B;
    private iub C;
    private final Map D;
    private final Runnable F;
    private final Set G;
    private boolean H;
    private final Context a;
    private final geb b;
    private final ght c;
    private final ggg d;
    private final Libjingle e;
    private final ggj f;
    private final List g;
    private final ConnectivityManager h;
    private final WifiManager i;
    private final android.net.wifi.WifiManager.WifiLock j;
    private geq k;
    private final gfh l;
    private final gge m;
    private final gir n;
    private gem o;
    private String p;
    private final gjl q;
    private final gdr r;
    private gkz s;
    private android.os.PowerManager.WakeLock t;
    private final gnb u;
    private final ghl v;
    private geu w;
    private boolean x;
    private final ggk y;

    public geg(Context context, geb geb1)
    {
        String s1;
        int i1;
        x = false;
        A = new geh(this);
        F = new gei(this);
        G = new HashSet();
        a = context;
        b = geb1;
        f = new ggj(context.getMainLooper());
        f.a(this);
        d = new ggh(context.getContentResolver());
        e = new Libjingle(context, f, d);
        c = ghs.a();
        n = new gir(context, c.g);
        q = new gjl(n, null, null);
        r = new gdr(new gep(this), q);
        D = new HashMap();
        AudioEffectsJB.initialize(d.a("babel_hangout_ns_mode"), d.a("babel_hangout_aec_mode"), d.a("babel_hangout_agc_mode"));
        e.a(AudioEffectsJB.shouldUseWebRTCNoiseSuppressor());
        e.b(AudioEffectsJB.shouldUseWebRTCAcousticEchoCanceler());
        e.c(AudioEffectsJB.shouldUseWebRTCAutomaticGainControl());
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_495;
        }
        i1 = d.a("babel_hangout_audio_record_sampling_rate", -1);
        s1 = ((AudioManager)a.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (i1 == -1) goto _L2; else goto _L1
_L1:
        WebRtcAudioUtils.setDefaultSampleRateHz(i1);
_L3:
        e.d();
        e.a(Long.toString(c.a), c.b, c.e);
        g = new CopyOnWriteArrayList();
        h = (ConnectivityManager)context.getSystemService("connectivity");
        i = (WifiManager)context.getSystemService("wifi");
        j = i.createWifiLock(3, "VideoChatWifiLock");
        j.setReferenceCounted(false);
        y = new ggk();
        l = new gfh(context);
        m = new gge(context);
        u = geb1.j();
        v = new ghl(context, geb1);
        return;
_L2:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_487;
        }
        i1 = Integer.parseInt(s1);
          goto _L1
        NumberFormatException numberformatexception;
        numberformatexception;
        gne.b("vclib", "AudioManager sample rate is invalid.", numberformatexception);
        i1 = 16000;
          goto _L1
        String s2 = ((AudioManager)a.getSystemService("audio")).getParameters("ec_supported");
        if (s2 != null)
        {
            String as[] = s2.split("=");
            if (as.length == 2)
            {
                String s3 = as[1].toLowerCase(Locale.US);
                if ("yes".equals(s3) || "true".equals(s3) || "1".equals(s3))
                {
                    e.b(false);
                }
            }
        }
        WebRtcAudioUtils.setDefaultSampleRateHz(d.a("babel_hangout_audio_record_sampling_rate", 16000));
          goto _L3
    }

    static gem a(geg geg1, gem gem1)
    {
        geg1.o = gem1;
        return gem1;
    }

    static ggk a(geg geg1)
    {
        return geg1.y;
    }

    static void a(geg geg1, gkq gkq1, gap gap)
    {
        geg1.a(gkq1, gap);
    }

    static void a(geg geg1, gmn gmn1)
    {
        itv itv1 = gmn1.z();
        Object obj = geg1.b.a().b();
        EncoderManager encodermanager = geg1.b.b().b();
        if (!g.a(itv1.g, false))
        {
            ((DecoderManager) (obj)).c();
            encodermanager.a();
        }
        int j1 = g.a(itv1.e, 1);
        int i1 = j1;
        if (j1 <= 1)
        {
            i1 = geg1.a.getSharedPreferences("startBitrate", 0).getInt(geg1.f(), -1);
        }
        itv1.e = Integer.valueOf(i1);
        geg1.e.a(kws.toByteArray(itv1));
        geg1.e.a(gmn1, ((DecoderManager) (obj)).b(), encodermanager.c());
        obj = new geo(geg1);
        gmn1 = new gjn(geg1.a, ((gix) (obj)), gmn1.a(), g.a(itv1.q, false));
        geg1.n.a(gmn1);
    }

    static void a(geg geg1, String s1)
    {
        geg1.h(s1);
    }

    private void a(gkq gkq1, gap gap)
    {
        g.v();
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((gew)iterator.next()).a(gkq1, gap)) { }
    }

    static void a(String s1, Object aobj[])
    {
        b(s1, aobj);
    }

    private void a(byte abyte0[], boolean flag, int i1)
    {
        gdv.b("Expected non-null", w);
        abyte0 = (ium)kws.mergeFrom(new ium(), abyte0);
        gdv.b("Expected condition to be false", TextUtils.isEmpty(((ium) (abyte0)).d));
        w.e(((ium) (abyte0)).d);
        if (flag)
        {
            try
            {
                gdv.b("Expected condition to be false", TextUtils.isEmpty(((ium) (abyte0)).c));
                w.l().a(((ium) (abyte0)).d, ((ium) (abyte0)).c, i1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                gne.a("vclib", "Unable to parse HandoffLogEntry proto from bytes", abyte0);
            }
            break MISSING_BLOCK_LABEL_113;
        }
        w.l().a(((ium) (abyte0)).d);
        return;
    }

    private void a(NamedSource anamedsource[], int i1)
    {
        int j1;
        int k1;
        g.v();
        k1 = anamedsource.length;
        j1 = 0;
_L2:
        Object obj;
        Object obj1;
        if (j1 >= k1)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        obj1 = anamedsource[j1];
        if (w.n() == null || !((NamedSource) (obj1)).a.equals(w.n().a()))
        {
            obj = w.c(((NamedSource) (obj1)).a);
            if (obj != null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = String.valueOf(((NamedSource) (obj1)).a);
            if (((String) (obj)).length() != 0)
            {
                obj = "Received a media source update for an unknown participant: ".concat(((String) (obj)));
            } else
            {
                obj = new String("Received a media source update for an unknown participant: ");
            }
            gne.a(6, "vclib", ((String) (obj)));
        }
_L8:
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 0 3: default 160
    //                   0 223
    //                   1 235
    //                   2 247
    //                   3 259;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_259;
_L3:
        gdv.a("Unexpected MediaSourceEvent type");
_L9:
        obj1 = new gkw(i1, ((NamedSource) (obj1)).c);
        Iterator iterator = g.iterator();
        while (iterator.hasNext()) 
        {
            ((gew)iterator.next()).a(((gkq) (obj)), ((gap) (obj1)));
        }
          goto _L8
_L4:
        ((gkq) (obj)).b(((NamedSource) (obj1)).c);
          goto _L9
_L5:
        ((gkq) (obj)).c(((NamedSource) (obj1)).c);
          goto _L9
_L6:
        ((gkq) (obj)).d(((NamedSource) (obj1)).c);
          goto _L9
        ((gkq) (obj)).e(((NamedSource) (obj1)).c);
          goto _L9
    }

    static Context b(geg geg1)
    {
        return geg1.a;
    }

    static String b(geg geg1, String s1)
    {
        geg1.p = s1;
        return s1;
    }

    private void b(String s1, int i1)
    {
        gdv.a(w.g(), s1);
        w.a(i1);
    }

    private static transient void b(String s1, Object aobj[])
    {
        if (gne.a(3))
        {
            gne.a(3, "vclib", String.format(s1, aobj));
        }
    }

    static String c(geg geg1)
    {
        return geg1.p;
    }

    static long d()
    {
        return z;
    }

    static gem d(geg geg1)
    {
        return geg1.o;
    }

    static Libjingle e(geg geg1)
    {
        return geg1.e;
    }

    private void e(int i1)
    {
        g.v();
        H = true;
        if (w != null)
        {
            Object obj = w.g();
            if (gne.a(3))
            {
                gne.a(3, "vclib", (new StringBuilder(String.valueOf(obj).length() + 53)).append("terminateCallInternal sessionId:").append(((String) (obj))).append(" endCause:").append(i1).toString());
            }
            obj = w.l().f();
            if (obj != null)
            {
                int j1 = ((com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats) (obj)).a;
                obj = a.getSharedPreferences("startBitrate", 0).edit();
                ((android.content.SharedPreferences.Editor) (obj)).putInt(f(), j1);
                ((android.content.SharedPreferences.Editor) (obj)).apply();
            }
            w.d(i1);
            if (s != null)
            {
                s.a();
                s = null;
            }
            if (o != null)
            {
                o.cancel(false);
                o = null;
            }
            if (y.b() == 2)
            {
                e.f();
                g.a(F, E);
                return;
            } else
            {
                h();
                return;
            }
        } else
        {
            gne.a(4, "vclib", "terminateCallInternal: abandoned");
            h();
            return;
        }
    }

    private boolean e()
    {
        return w != null;
    }

    static geu f(geg geg1)
    {
        return geg1.w;
    }

    private String f()
    {
        NetworkInfo networkinfo = h.getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return "networkType";
        } else
        {
            String s1 = String.valueOf("networkType");
            int i1 = networkinfo.getType();
            return (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(i1).toString();
        }
    }

    static gir g(geg geg1)
    {
        return geg1.n;
    }

    private void g()
    {
        gdv.a("Expected condition to be true", t.isHeld());
        g.v();
        Object obj = e;
        String s1 = String.valueOf(c.g);
        if (s1.length() != 0)
        {
            s1 = "apiaryUri: ".concat(s1);
        } else
        {
            s1 = new String("apiaryUri: ");
        }
        ((Libjingle) (obj)).c(s1);
        s1 = w.g();
        obj = w.j();
        if (gkz.a(((gmn) (obj))))
        {
            s = new gkz(a, q, ((gmn) (obj)), new gej(this, s1, ((gmn) (obj))));
            s.b();
            return;
        }
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = "initiateCall for ".concat(s1);
        } else
        {
            s1 = new String("initiateCall for ");
        }
        b(s1, new Object[0]);
        s1 = ((gmn) (obj)).f();
        h(s1);
        e.a(((gmn) (obj)), s1);
    }

    private boolean g(String s1)
    {
        return w != null && w.g().equals(s1);
    }

    static List h(geg geg1)
    {
        return geg1.g;
    }

    private void h()
    {
        b("CallManager.finishCall", new Object[0]);
        Runnable runnable = F;
        g.x().removeCallbacks(runnable);
        C = null;
        g.v();
        b("CallManager.endCallAndSignOut", new Object[0]);
        runnable = A;
        g.x().removeCallbacks(runnable);
        if (y.b() == 0)
        {
            gne.a(4, "vclib", "Ignoring endCallAndSignOut; call never joined.");
        } else
        {
            y.a(3);
            y.c();
            e.e();
        }
        i();
        f.a(null);
        e.b();
        if (w != null)
        {
            if (w.p() != 1015 && w.a() != null)
            {
                gdy.a(new gen((gdk)r.a(gdk), w.a()));
            } else
            {
                gne.a(3, "vclib", "Skiping LeaveHandler, endCause: %d, resolveHangoutId: %s", new Object[] {
                    Integer.valueOf(w.p()), w.a()
                });
            }
        } else
        {
            gne.a(3, "vclib", "currentCall is null; leave not required.");
        }
        if (k != null)
        {
            a.unregisterReceiver(k);
            k = null;
        }
        m.a();
        D.clear();
        v.a();
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((gew)iterator.next()).b(w)) { }
        w = null;
        n.a(null);
    }

    private void h(String s1)
    {
        w.a(s1);
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((gew)iterator.next()).a(s1)) { }
    }

    private void i()
    {
        if (y.b() != 0)
        {
            y.a(0);
        }
        g.v();
        if (t != null)
        {
            gne.a(4, "vclib", "Releasing WakeLock");
            t.release();
            t = null;
        }
        if (j.isHeld())
        {
            gne.a(4, "vclib", "Releasing WiFi lock");
            j.release();
        }
    }

    static boolean i(geg geg1)
    {
        return geg1.e();
    }

    static ConnectivityManager j(geg geg1)
    {
        return geg1.h;
    }

    static void k(geg geg1)
    {
        if (geg1.w != null)
        {
            geg1.w.c(3);
            geg1.e(1003);
        }
    }

    static boolean l(geg geg1)
    {
        return geg1.e.c();
    }

    geu a()
    {
        g.v();
        return w;
    }

    void a(char c1, int i1, String s1)
    {
        g.v();
        e.a(c1, i1, s1);
    }

    void a(int i1)
    {
        e(i1);
    }

    public void a(int i1, int j1, byte abyte0[])
    {
        g.v();
        if (r != null)
        {
            r.a(i1, j1, abyte0);
        }
    }

    public void a(int i1, String s1)
    {
        gne.a(2, "vclib", "Level: %d participant: %s", new Object[] {
            Integer.valueOf(i1), s1
        });
        g.v();
        b.i().a(i1, s1);
    }

    public void a(long l1)
    {
        gdv.a("Expected condition to be true", D.containsKey(Long.valueOf(l1)));
        gja gja1 = (gja)D.get(Long.valueOf(l1));
        if (gja1 != null)
        {
            n.a(gja1.a());
        }
    }

    public void a(long l1, String s1, byte abyte0[], int i1)
    {
        n.a(l1, s1, abyte0, i1);
    }

    public void a(long l1, String s1, byte abyte0[], long l2)
    {
        gdv.a("Expected condition to be true", D.containsKey(Long.valueOf(l2)));
        gja gja1 = (gja)D.get(Long.valueOf(l2));
        if (gja1 != null)
        {
            gja1.a(l1, s1, abyte0);
        }
    }

    public void a(Stats stats)
    {
        w.l().b(stats);
    }

    void a(gew gew1)
    {
        g.v();
        if (!g.contains(gew1))
        {
            g.add(gew1);
        }
    }

    void a(PrintWriter printwriter)
    {
        if (w == null)
        {
            return;
        }
        w.l().a(printwriter);
        if (e())
        {
            printwriter.println("Call info");
            String s1;
            boolean flag;
            if (w != null && w.e())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                s1 = "connected";
            } else
            {
                s1 = "-";
            }
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s1 = "     media state: ".concat(s1);
            } else
            {
                s1 = new String("     media state: ");
            }
            printwriter.println(s1);
            s1 = String.valueOf(w.g());
            if (s1.length() != 0)
            {
                s1 = "  localSessionId: ".concat(s1);
            } else
            {
                s1 = new String("  localSessionId: ");
            }
            printwriter.println(s1);
            if (w.a() != null)
            {
                s1 = String.valueOf(w.a());
                if (s1.length() != 0)
                {
                    s1 = "     hangoutId: ".concat(s1);
                } else
                {
                    s1 = new String("     hangoutId: ");
                }
                printwriter.println(s1);
            }
        }
        RendererManager.d();
    }

    void a(String s1)
    {
        g.v();
        e.a(s1);
    }

    public void a(String s1, int i1)
    {
        g.v();
        if (g(s1))
        {
            for (Iterator iterator = g.iterator(); iterator.hasNext(); ((gew)iterator.next()).a(s1, i1)) { }
        }
    }

    public void a(String s1, int i1, int j1)
    {
        g.v();
        if (g(s1)) goto _L2; else goto _L1
_L1:
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = "Received state change for unknown call: ".concat(s1);
        } else
        {
            s1 = new String("Received state change for unknown call: ");
        }
        gne.a(5, "vclib", s1);
_L4:
        return;
_L2:
        String s2;
        int k1 = w.k();
        switch (i1)
        {
        case 3: // '\003'
        case 5: // '\005'
        default:
            return;

        case 0: // '\0'
        case 7: // '\007'
        case 8: // '\b'
        case 11: // '\013'
            break;

        case 1: // '\001'
            w.l().a();
            w.l().d();
            b(s1, i1);
            return;

        case 2: // '\002'
            gdv.a("This is not expected");
            return;

        case 6: // '\006'
            w.l().b();
            b(s1, i1);
            return;

        case 4: // '\004'
        case 9: // '\t'
            b(s1, i1);
            return;

        case 10: // '\n'
            w.d(1007);
            b(s1, i1);
            return;

        case 12: // '\f'
            w.c(j1);
            b(s1, i1);
            w.d(1007);
            return;

        case 13: // '\r'
            w.c(j1);
            b(s1, i1);
            if (k1 == 1)
            {
                w.d(1008);
                return;
            } else
            {
                w.d(1009);
                return;
            }

        case 14: // '\016'
            b(s1, i1);
            w.l().c();
            s1 = g.iterator();
            while (s1.hasNext()) 
            {
                ((gew)s1.next()).a(w);
            }
            break;

        case 15: // '\017'
            s2 = String.valueOf(s1);
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s2.length() != 0)
        {
            s2 = "STATE_DEINIT sessionid: ".concat(s2);
        } else
        {
            s2 = new String("STATE_DEINIT sessionid: ");
        }
        b(s2, new Object[0]);
        b(s1, i1);
        b(1, ((String) (null)));
        return;
    }

    public void a(String s1, int i1, int j1, String s2, String s3, String s4, byte abyte0[])
    {
        if (gne.a(3))
        {
            b("handleEndpointEvent: participantId=%s eventType=%s, args=%d, %s, %s, %s, participantProto? %b", new Object[] {
                s1, ggj.a(i1), Integer.valueOf(j1), s2, s3, s4, abyte0
            });
        }
        if (w != null) goto _L2; else goto _L1
_L1:
        b("Got endpoint event, but there's no current call. Ignore.", new Object[0]);
_L6:
        return;
_L2:
        Object obj = w.b(s1);
        if (i1 != 0 && i1 != 1) goto _L4; else goto _L3
_L3:
        if (obj != null) goto _L6; else goto _L5
_L5:
        if (abyte0 == null) goto _L8; else goto _L7
_L7:
        obj = (jhh)kws.mergeFrom(new jhh(), abyte0);
        abyte0 = ((jhh) (obj)).e;
_L30:
        String s5;
        s5 = abyte0;
        abyte0 = ((byte []) (obj));
_L19:
        boolean flag = false;
        if (((jhh) (abyte0)).n.intValue() == 5)
        {
            gdv.a(Integer.valueOf(i1), Integer.valueOf(1));
            s1 = new gkx(s1, s3, j1, s2);
        } else
        {
            boolean flag1;
            if (i1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kwr kwr1;
            if (!flag && w.n() != null)
            {
                flag1 = w.n().w().equals(s2);
            } else
            {
                flag1 = flag;
            }
            s1 = new gku(s1, s3, s5, j1, s2, flag, flag1, s4);
        }
        if (flag)
        {
            w.a((gku)s1);
        } else
        {
            w.a(s1);
        }
        s2 = new gks();
        if (i1 != 0) goto _L10; else goto _L9
_L9:
        if (abyte0 != null)
        {
            r.a(gdk.a.a(abyte0));
            v.a(new int[] {
                500
            });
        } else
        {
            abyte0 = null;
        }
        if (abyte0 == null) goto _L12; else goto _L11
_L11:
        b("Updating privileges from proto", new Object[0]);
        s3 = ((jhh) (abyte0)).s;
        j1 = s3.length;
        i1 = 0;
_L18:
        if (i1 >= j1) goto _L14; else goto _L13
_L13:
        s3[i1];
        JVM INSTR tableswitch 3 4: default 304
    //                   3 414
    //                   4 421;
           goto _L15 _L16 _L17
_L15:
        i1++;
          goto _L18
        obj;
        abyte0 = null;
_L29:
        gne.b("vclib", "Could not parse participantProto", ((Throwable) (obj)));
        s5 = null;
          goto _L19
_L16:
        s1.s();
          goto _L15
_L17:
        s1.u();
          goto _L15
_L14:
        s3 = s2;
        s2 = s1;
        s1 = s3;
_L20:
        a(((gkq) (s2)), ((gap) (s1)));
        return;
_L12:
        b("Fallback to legacy privileges", new Object[0]);
        s1.s();
_L10:
        s3 = s1;
        s1 = s2;
        s2 = s3;
          goto _L20
_L4:
        if (i1 != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (obj == null)
        {
            gne.b("vclib", "Got an ENDPOINT_EXITED event for %s, which doesn't exist in endpoints", new Object[] {
                s1
            });
            return;
        }
        if (TextUtils.isEmpty(s2))
        {
            break MISSING_BLOCK_LABEL_575;
        }
        i1 = Integer.parseInt(s2);
        s1 = Integer.valueOf(i1);
_L21:
        w.b(((gkq) (obj)));
        s1 = new gkt(s1);
        s2 = ((String) (obj));
          goto _L20
        s1;
        s1 = String.valueOf(s2);
        if (s1.length() != 0)
        {
            s1 = "CallState - unexpected endpoint exit error string:".concat(s1);
        } else
        {
            s1 = new String("CallState - unexpected endpoint exit error string:");
        }
        gne.a(5, "vclib", s1);
        s1 = null;
          goto _L21
        if (obj == null) goto _L6; else goto _L22
_L22:
        i1;
        JVM INSTR tableswitch 3 6: default 632
    //                   3 647
    //                   4 671
    //                   5 799
    //                   6 850;
           goto _L23 _L24 _L25 _L26 _L27
_L23:
        gdv.a("Unexpected event type");
        s1 = null;
        s2 = ((String) (obj));
          goto _L20
_L24:
        if (!((gkq) (obj)).a(j1)) goto _L6; else goto _L28
_L28:
        s1 = new gkp();
        s2 = ((String) (obj));
          goto _L20
_L25:
        if (j1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s2 == null)
        {
            s3 = null;
        } else
        {
            s3 = w.b(s2);
        }
        gdv.b(obj, s3);
        s4 = new gko(flag, s3);
        if (((gkq) (obj)).k())
        {
            s1 = s4;
            s2 = ((String) (obj));
            if (s3 != null)
            {
                gdv.a("Expected condition to be true", ((gko)s4).b());
                WebRtcAudioRecord.setMicrophoneMute(flag);
                ((gkq) (obj)).a(flag);
                s1 = s4;
                s2 = ((String) (obj));
            }
        } else
        {
            ((gkq) (obj)).a(flag);
            s1 = s4;
            s2 = ((String) (obj));
        }
          goto _L20
_L26:
        if (j1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", obj instanceof gku);
        ((gku)obj).b(flag);
        s1 = new gky(flag);
        s2 = ((String) (obj));
          goto _L20
_L27:
        s4 = w.b(s2);
        s3 = new gkv(s4);
        if (((gkq) (obj)).k())
        {
            s4.q();
            s1 = s3;
            s2 = ((String) (obj));
        } else
        {
            s1 = s3;
            s2 = ((String) (obj));
            if (s4.k())
            {
                ((gkq) (obj)).q();
                s1 = s3;
                s2 = ((String) (obj));
            }
        }
          goto _L20
        kwr1;
        abyte0 = ((byte []) (obj));
        obj = kwr1;
          goto _L29
_L8:
        obj = null;
        abyte0 = null;
          goto _L30
    }

    public void a(String s1, int i1, String s2, String s3)
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((gew)iterator.next()).a(s1, i1, s2, s3)) { }
    }

    public void a(String s1, MediaSources mediasources)
    {
        g.v();
        if (!g(s1))
        {
            return;
        } else
        {
            a(mediasources.a, 0);
            a(mediasources.b, 1);
            a(mediasources.c, 2);
            a(mediasources.d, 3);
            return;
        }
    }

    void a(String s1, String s2, boolean flag, boolean flag1, boolean flag2, byte abyte0[])
    {
        g.v();
        e.a(s1, s2, false, flag1, flag2, abyte0);
    }

    public void a(String s1, boolean flag, String s2, boolean flag1, String s3)
    {
        w.d(s3);
        for (s3 = g.iterator(); s3.hasNext(); ((gew)s3.next()).a(s1, flag, s2, flag1)) { }
    }

    void a(boolean flag)
    {
        g.v();
        if (flag != x)
        {
            e.e(flag);
            x = flag;
        }
    }

    void a(boolean flag, String as[], String as1[], int i1, boolean flag1, boolean flag2, String s1)
    {
        g.v();
        e.a(false, as, as1, 1, true, false, null);
    }

    void a(byte abyte0[])
    {
        g.v();
        if (e.c())
        {
            e.handlePushNotification(abyte0);
        }
    }

    public void a(com.google.android.libraries.hangouts.video.ConnectivityReporter.NicInfo anicinfo[])
    {
        if (anicinfo == null || anicinfo.length == 0)
        {
            anicinfo = null;
        } else
        {
            iui iui1 = new iui();
            iui1.a = new iuj[anicinfo.length];
            for (int i1 = 0; i1 < anicinfo.length; i1++)
            {
                iui1.a[i1] = anicinfo[i1].a();
            }

            anicinfo = iui1;
        }
        if (anicinfo != null)
        {
            anicinfo.d = Integer.valueOf(w.o());
            anicinfo.e = C;
            if (gne.a(2))
            {
                gne.a(2, "vclib", "Connectivity check completed: %s", new Object[] {
                    anicinfo.toString()
                });
            }
            w.a(anicinfo);
        }
        h();
        B = false;
    }

    void a(VideoViewRequest avideoviewrequest[])
    {
        g.v();
        if (H)
        {
            gne.a(5, "vclib", "Ignoring view request issued while leaving a call.");
            return;
        } else
        {
            e.a(avideoviewrequest);
            return;
        }
    }

    boolean a(gmn gmn1)
    {
        g.v();
        gdv.a("Expected null", w);
        if (gmn1.a() == null)
        {
            throw new IllegalStateException("No session id provided for call");
        }
        w = new geu(gmn1);
        NetworkInfo networkinfo = h.getActiveNetworkInfo();
        if (networkinfo == null)
        {
            gne.a(6, "vclib", "No network connected");
            w.d(1001);
            h();
            return false;
        }
        gdv.a("Expected null", t);
        g.v();
        t = ((PowerManager)a.getSystemService("power")).newWakeLock(0x20000001, "vclib");
        gne.a(4, "vclib", "Acquiring WakeLock");
        t.acquire();
        if (networkinfo.getType() == 1)
        {
            gne.a(4, "vclib", "Acquiring WiFi lock");
            j.acquire();
        }
        w.b(l.a());
        if (gmn1.u())
        {
            IntentFilter intentfilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            k = new geq(this);
            a.registerReceiver(k, intentfilter);
        }
        y.b();
        JVM INSTR tableswitch 0 2: default 252
    //                   0 287
    //                   1 304
    //                   2 317;
           goto _L1 _L2 _L3 _L4
_L1:
        int i1 = y.b();
        gdv.a((new StringBuilder(37)).append("Unexpected sign-in state: ").append(i1).toString());
        return false;
_L2:
        b("We're not yet signed in; signing in and postponing initiation until done", new Object[0]);
        b(gmn1);
_L6:
        return true;
_L3:
        b("Sign-in in progress. Postponing initiation until done", new Object[0]);
        continue; /* Loop/switch isn't completed */
_L4:
        w.c();
        g();
        if (true) goto _L6; else goto _L5
_L5:
    }

    ggk b()
    {
        g.v();
        return y;
    }

    public void b(int i1)
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((gew)iterator.next()).a(i1)) { }
    }

    public void b(int i1, String s1)
    {
        boolean flag;
        flag = false;
        b((new StringBuilder(String.valueOf(s1).length() + 41)).append("CallManager.handleCallEnd: ").append(i1).append(" / ").append(s1).toString(), new Object[0]);
        g.v();
        if (w != null) goto _L2; else goto _L1
_L1:
        if (i1 == 21 || i1 == 22 || i1 == 1003 || i1 == 1015 || i1 == 23 || i1 == 1018)
        {
            flag = true;
        }
        gdv.a("Expected condition to be true", flag);
_L4:
        return;
_L2:
        if (B) goto _L4; else goto _L3
_L3:
        w.a(i1, s1);
        i1 = w.p();
        if (w.r()) goto _L6; else goto _L5
_L5:
        i1 = 0;
_L8:
        if (i1 != 0)
        {
            B = true;
            C = l.a(w.o());
            e.g();
            return;
        } else
        {
            b("CallManager.handleCallEnd - finishing call", new Object[0]);
            h();
            return;
        }
_L6:
        switch (c.f)
        {
        default:
            gdv.a("Unexpected");
            i1 = 0;
            break;

        case 2: // '\002'
            continue; /* Loop/switch isn't completed */

        case 0: // '\0'
            i1 = 0;
            break;

        case 1: // '\001'
            switch (i1)
            {
            default:
                i1 = 0;
                break;

            case 1: // '\001'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 1000: 
            case 1001: 
            case 1002: 
            case 1003: 
            case 1017: 
            case 1018: 
                i1 = 1;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        continue; /* Loop/switch isn't completed */
        i1 = 1;
          goto _L7
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void b(long l1, String s1, byte abyte0[], int i1)
    {
        gdv.b("Expected condition to be false", D.containsKey(Long.valueOf(l1)));
        s1 = (new gja()).a(l1, s1, abyte0, i1);
        D.put(Long.valueOf(l1), s1);
    }

    public void b(Stats stats)
    {
        if (!(stats instanceof com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats)) goto _L2; else goto _L1
_L1:
        com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats connectioninfostats = (com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats)stats;
        int i1 = w.o();
        connectioninfostats.setMediaNetworkType(i1);
        connectioninfostats.setSignalStrength(l.a(i1));
_L9:
        itz itz1;
        gmo gmo1;
        w.l().a(stats);
        itz1 = new itz();
        gmo1 = b.i();
        if (!(stats instanceof com.google.android.libraries.hangouts.video.Stats.VoiceSenderStats)) goto _L4; else goto _L3
_L3:
        ((com.google.android.libraries.hangouts.video.Stats.VoiceSenderStats)stats).addTo(itz1);
        gmo1.a(itz1);
_L6:
        return;
_L2:
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.GlobalStats)
        {
            m.a((com.google.android.libraries.hangouts.video.Stats.GlobalStats)stats);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VoiceReceiverStats)
        {
            ((com.google.android.libraries.hangouts.video.Stats.VoiceReceiverStats)stats).addTo(itz1);
            gmo1.a(itz1);
            return;
        }
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VideoSenderStats)
        {
            ((com.google.android.libraries.hangouts.video.Stats.VideoSenderStats)stats).addTo(itz1);
            gmo1.a(itz1);
            return;
        }
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats)
        {
            ((com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats)stats).addTo(itz1);
            gmo1.a(itz1);
            return;
        }
        if (!(stats instanceof com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats)) goto _L6; else goto _L5
_L5:
        int j1;
        stats = (com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats)stats;
        stats.addTo(itz1);
        gmo1.a(itz1);
        j1 = ((com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats) (stats)).a;
        if (j1 >= 0x7a120 && !G.contains(Integer.valueOf(0x7a120)))
        {
            u.a(2694);
            G.add(Integer.valueOf(0x7a120));
            v.a(new int[] {
                501
            });
        }
        if (j1 >= 0xf4240 && !G.contains(Integer.valueOf(0xf4240)))
        {
            u.a(2695);
            G.add(Integer.valueOf(0xf4240));
            v.a(new int[] {
                502
            });
        }
        if (j1 < 0x16e360 || G.contains(Integer.valueOf(0x16e360))) goto _L6; else goto _L7
_L7:
        u.a(2696);
        G.add(Integer.valueOf(0x16e360));
        v.a(new int[] {
            503
        });
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    void b(gew gew1)
    {
        g.v();
        g.remove(gew1);
    }

    void b(gmn gmn1)
    {
        Object obj = new ixb();
        if (g.a(gmn1.z().b, false))
        {
            obj.a = Integer.valueOf(27);
        } else
        {
            obj.a = Integer.valueOf(1);
        }
        obj.d = Long.valueOf(c.a);
        q.a(((ixb) (obj)));
        obj = new iwy();
        obj.a = gmn1.p();
        obj.b = gmn1.o();
        obj.d = gmn1.b();
        q.a(((iwy) (obj)));
        obj = ((gjj)hlp.a(a, gjj)).a(gmn1.n());
        y.a(((gji) (obj)));
        y.a(1);
        o = new gem(this, ((gji) (obj)), true, gmn1);
        o.a(new Void[0]);
        g.a(A, z);
    }

    void b(String s1)
    {
        g.v();
        jho jho1 = new jho();
        jho1.a = w.a();
        jho1.b = s1;
        jho1.c = Integer.valueOf(43);
        ((gdk)r.a(gdk)).c(jho1, new gek(this, s1));
    }

    void b(boolean flag)
    {
        g.v();
        if (w != null)
        {
            if (w.e())
            {
                e.d(flag);
            }
            if (w.n() == null)
            {
                throw new IllegalStateException("Mute is allowed only after STATE_INPROGRESS");
            }
            w.n().a(flag);
            g.a(new gel(this, flag));
        }
    }

    public void b(byte abyte0[])
    {
        if (w != null)
        {
            w.a(true);
            a(abyte0, false, 0);
        }
    }

    gdr c()
    {
        return r;
    }

    public void c(int i1)
    {
        gmu gmu1 = new gmu(i1);
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((gew)iterator.next()).a(gmu1)) { }
    }

    void c(String s1)
    {
        g.v();
        e.b(s1);
    }

    public void c(boolean flag)
    {
        b((new StringBuilder(41)).append("handleSignedInStateUpdate: signedIn=").append(flag).toString(), new Object[0]);
        g.v();
        if (flag)
        {
            y.a(2);
            if (w != null && w.b())
            {
                w.c();
                g();
            }
            return;
        }
        if (y.b() == 1)
        {
            if (y.d())
            {
                b(1000, ((String) (null)));
                return;
            }
            gne.a(4, "vclib", "Invalidating token.");
            if (y.a() != null)
            {
                y.a().b(a, p);
            }
            p = null;
            y.e();
            o = new gem(this, y.a(), false, null);
            o.a(new Void[0]);
            return;
        } else
        {
            i();
            return;
        }
    }

    public void c(byte abyte0[])
    {
        if (w != null)
        {
            w.a(false);
            byte byte0;
            if (w.m().size() > 1)
            {
                byte0 = 51;
            } else
            {
                byte0 = 23;
            }
            a(abyte0, true, byte0);
        }
    }

    public void d(int i1)
    {
        e(i1);
    }

    void d(String s1)
    {
        e.c(s1);
    }

    public void d(byte abyte0[])
    {
        try
        {
            abyte0 = (jjr)kws.mergeFrom(new jjr(), abyte0);
            for (Iterator iterator = g.iterator(); iterator.hasNext(); ((gew)iterator.next()).a(abyte0)) { }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            gne.b("vclib", "Cannot parse StreamRequest.", abyte0);
        }
    }

    public void e(String s1)
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((gew)iterator.next()).b(s1)) { }
    }

    public void e(byte abyte0[])
    {
        try
        {
            abyte0 = new gmu((itu)kws.mergeFrom(new itu(), abyte0));
            b.i().a(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            gne.b("vclib", "Cannot parse Media Event.", abyte0);
        }
    }

    public void f(String s1)
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((gew)iterator.next()).c(s1)) { }
    }

    static 
    {
        z = TimeUnit.MINUTES.toMillis(55L);
        E = TimeUnit.SECONDS.toMillis(15L);
    }
}
