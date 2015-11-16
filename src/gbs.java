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
import com.google.android.libraries.hangouts.video.ConnectivityReporter;
import com.google.android.libraries.hangouts.video.Libjingle;
import com.google.android.libraries.hangouts.video.MediaSources;
import com.google.android.libraries.hangouts.video.NamedSource;
import com.google.android.libraries.hangouts.video.RendererManager;
import com.google.android.libraries.hangouts.video.Stats;
import com.google.android.libraries.hangouts.video.VideoViewRequest;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.voiceengine.AudioEffectsJB;
import org.webrtc.voiceengine.WebRtcAudioRecord;
import org.webrtc.voiceengine.WebRtcAudioUtils;

final class gbs
    implements gdu
{

    private static final long C;
    private static final long w;
    private static final Pattern y = Pattern.compile("([a-zA-Z0-9]+)@.*");
    private inw A;
    private final Map B;
    private final Runnable D;
    private final Context a;
    private final get b;
    private final gds c;
    private final Libjingle d;
    private final gdv e;
    private final List f;
    private final ConnectivityManager g;
    private final WifiManager h;
    private final android.net.wifi.WifiManager.WifiLock i;
    private gcc j;
    private final gcp k;
    private final gdq l;
    private final gfr m;
    private gby n;
    private String o;
    private ggl p;
    private gbd q;
    private ghx r;
    private android.os.PowerManager.WakeLock s;
    private gcg t;
    private boolean u;
    private final gdw v;
    private final Runnable x;
    private boolean z;

    public gbs(Context context)
    {
        String s1;
        int i1;
        u = false;
        x = new gbt(this);
        D = new gbu(this);
        a = context;
        e = new gdv(context.getMainLooper());
        e.a(this);
        c = new gdt(context.getContentResolver());
        d = new Libjingle(context, e, c);
        b = ges.a();
        m = new gfr(context, b.h);
        B = new HashMap();
        AudioEffectsJB.initialize(c.a("babel_hangout_ns_mode"), c.a("babel_hangout_aec_mode"), c.a("babel_hangout_agc_mode"));
        d.a(AudioEffectsJB.shouldUseWebRTCNoiseSuppressor());
        d.b(AudioEffectsJB.shouldUseWebRTCAcousticEchoCanceler());
        d.c(AudioEffectsJB.shouldUseWebRTCAutomaticGainControl());
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        i1 = c.a("babel_hangout_audio_record_sampling_rate", -1);
        s1 = ((AudioManager)a.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (i1 == -1) goto _L2; else goto _L1
_L1:
        WebRtcAudioUtils.setDefaultSampleRateHz(i1);
_L3:
        d.d();
        d.a(b.a, Long.toString(b.b), b.c, b.f);
        f = new CopyOnWriteArrayList();
        g = (ConnectivityManager)context.getSystemService("connectivity");
        h = (WifiManager)context.getSystemService("wifi");
        i = h.createWifiLock(3, "VideoChatWifiLock");
        i.setReferenceCounted(false);
        v = new gdw();
        k = new gcp(context);
        l = new gdq(context);
        return;
_L2:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_413;
        }
        i1 = Integer.parseInt(s1);
          goto _L1
        NumberFormatException numberformatexception;
        numberformatexception;
        gkc.c("vclib", "AudioManager sample rate is invalid.", numberformatexception);
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
                    d.b(false);
                }
            }
        }
        WebRtcAudioUtils.setDefaultSampleRateHz(c.a("babel_hangout_audio_record_sampling_rate", 16000));
          goto _L3
    }

    static gby a(gbs gbs1, gby gby1)
    {
        gbs1.n = gby1;
        return gby1;
    }

    static gdw a(gbs gbs1)
    {
        return gbs1.v;
    }

    static void a(gbs gbs1, gho gho1, fyb fyb)
    {
        gbs1.a(gho1, fyb);
    }

    static void a(gbs gbs1, gjl gjl1)
    {
        inq inq1;
        int i1;
        int j1;
        int k1;
        int l1;
        i1 = -1;
        inq1 = gjl1.A();
        int i2 = gbs1.b.d;
        l1 = gbs1.b.e;
        k1 = l1;
        j1 = i2;
        if (!g.a(inq1.g, false))
        {
            j1 = i2 & -3;
            k1 = l1 & -3;
        }
        l1 = g.a(inq1.e, -1);
        if (l1 != 1) goto _L2; else goto _L1
_L1:
        i1 = gbs1.a.getSharedPreferences("startBitrate", 0).getInt(gbs1.h(), -1);
_L4:
        inq1.e = Integer.valueOf(i1);
        gbs1.d.a(kop.toByteArray(inq1));
        gbs1.d.a(gjl1, j1, k1);
        gca gca1 = new gca(gbs1);
        gjl1 = new ggn(gbs1.a, gca1, gjl1.a(), g.a(inq1.q, false));
        gbs1.m.a(gjl1);
        return;
_L2:
        if (l1 > 0)
        {
            i1 = l1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(gbs gbs1, String s1)
    {
        gbs1.h(s1);
    }

    private void a(gho gho1, fyb fyb)
    {
        g.w();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((gci)iterator.next()).a(gho1, fyb)) { }
    }

    private void a(String s1, NamedSource anamedsource[], int i1)
    {
        int j1;
        int k1;
        g.w();
        k1 = anamedsource.length;
        j1 = 0;
_L2:
        Object obj;
        Object obj1;
        if (j1 >= k1)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        obj1 = anamedsource[j1];
        String s2 = String.format("%s/%s", new Object[] {
            s1, ((NamedSource) (obj1)).a
        });
        if (s2 == null || t.e == null || !s2.equals(t.e.a()))
        {
            obj = t.c(s2);
            if (obj != null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = String.valueOf(s2);
            if (((String) (obj)).length() != 0)
            {
                obj = "Received a media source update for an unknown participant: ".concat(((String) (obj)));
            } else
            {
                obj = new String("Received a media source update for an unknown participant: ");
            }
            gkc.e("vclib", ((String) (obj)));
        }
_L8:
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 0 3: default 184
    //                   0 248
    //                   1 261
    //                   2 274
    //                   3 287;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_287;
_L3:
        gbh.a("Unexpected MediaSourceEvent type");
_L9:
        obj1 = new ghu(i1, ((NamedSource) (obj1)).c);
        Iterator iterator = f.iterator();
        while (iterator.hasNext()) 
        {
            ((gci)iterator.next()).a(((gho) (obj)), ((fyb) (obj1)));
        }
          goto _L8
_L4:
        ((gho) (obj)).b(((NamedSource) (obj1)).c);
          goto _L9
_L5:
        ((gho) (obj)).c(((NamedSource) (obj1)).c);
          goto _L9
_L6:
        ((gho) (obj)).d(((NamedSource) (obj1)).c);
          goto _L9
        ((gho) (obj)).e(((NamedSource) (obj1)).c);
          goto _L9
    }

    static void a(String s1, Object aobj[])
    {
        b(s1, aobj);
    }

    static Context b(gbs gbs1)
    {
        return gbs1.a;
    }

    static String b(gbs gbs1, String s1)
    {
        gbs1.o = s1;
        return s1;
    }

    private void b(String s1, int i1)
    {
        gbh.a(t.a, s1);
        t.a(i1);
    }

    private static transient void b(String s1, Object aobj[])
    {
        if (gkc.c())
        {
            gkc.b("vclib", String.format(s1, aobj));
        }
    }

    static String c(gbs gbs1)
    {
        return gbs1.o;
    }

    static gby d(gbs gbs1)
    {
        return gbs1.n;
    }

    static Libjingle e(gbs gbs1)
    {
        return gbs1.d;
    }

    private void e(int i1)
    {
        boolean flag1 = true;
        g.w();
        if (t != null)
        {
            String s1 = t.g();
            if (gkc.c())
            {
                gkc.b("vclib", (new StringBuilder(String.valueOf(s1).length() + 53)).append("terminateCallInternal sessionId:").append(s1).append(" endCause:").append(i1).toString());
            }
            Object obj = t.l().f();
            if (obj != null)
            {
                int j1 = ((com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats) (obj)).a;
                obj = a.getSharedPreferences("startBitrate", 0).edit();
                ((android.content.SharedPreferences.Editor) (obj)).putInt(h(), j1);
                ((android.content.SharedPreferences.Editor) (obj)).apply();
            }
            t.d(i1);
            if (r != null)
            {
                r.a();
                r = null;
            }
            if (n != null)
            {
                n.cancel(false);
                n = null;
            }
            boolean flag;
            if (t.n() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (i1 == 1015)
                {
                    flag1 = false;
                }
                d.a(s1, flag1);
                if (flag1)
                {
                    String s2 = i(t.n().a());
                    gbk.a(new gbz(p, t.a(), s2));
                }
                g.a(D, C);
                return;
            } else
            {
                a(i1, ((String) (null)));
                return;
            }
        } else
        {
            gkc.c("vclib", "terminateCallInternal: abandoned");
            j();
            return;
        }
    }

    static long f()
    {
        return w;
    }

    static gcg f(gbs gbs1)
    {
        return gbs1.t;
    }

    static gfr g(gbs gbs1)
    {
        return gbs1.m;
    }

    private boolean g()
    {
        return t != null;
    }

    private boolean g(String s1)
    {
        return t != null && t.a.equals(s1);
    }

    private String h()
    {
        NetworkInfo networkinfo = g.getActiveNetworkInfo();
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

    static List h(gbs gbs1)
    {
        return gbs1.f;
    }

    private void h(String s1)
    {
        t.a(s1);
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((gci)iterator.next()).a(s1)) { }
    }

    private static String i(String s1)
    {
        return s1.substring(s1.indexOf("/") + 1);
    }

    private void i()
    {
        gbh.a(s.isHeld());
        g.w();
        Object obj = d;
        String s1 = String.valueOf(b.h);
        gjl gjl1;
        if (s1.length() != 0)
        {
            s1 = "apiaryUri: ".concat(s1);
        } else
        {
            s1 = new String("apiaryUri: ");
        }
        ((Libjingle) (obj)).d(s1);
        s1 = t.g();
        gjl1 = t.j();
        if (ghx.a(gjl1))
        {
            r = new ghx(a, p, gjl1, new gbv(this, s1, gjl1));
            r.b();
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
        obj = gjl1.f();
        s1 = ((String) (obj));
        if (obj == null)
        {
            s1 = gjl1.j();
        }
        h(s1);
        d.a(gjl1, s1);
    }

    static boolean i(gbs gbs1)
    {
        return gbs1.g();
    }

    static ConnectivityManager j(gbs gbs1)
    {
        return gbs1.g;
    }

    private void j()
    {
        b("CallManager.finishCall", new Object[0]);
        Runnable runnable = D;
        g.y().removeCallbacks(runnable);
        A = null;
        g.w();
        b("CallManager.endCallAndSignOut", new Object[0]);
        runnable = x;
        g.y().removeCallbacks(runnable);
        if (v.b() == 0)
        {
            gkc.c("vclib", "Ignoring endCallAndSignOut; call never joined.");
        } else
        {
            v.a(3);
            v.d();
            d.c(v.a().a());
        }
        k();
        e.a(null);
        d.b();
        if (j != null)
        {
            a.unregisterReceiver(j);
            j = null;
        }
        l.a();
        B.clear();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((gci)iterator.next()).b(t)) { }
        t = null;
        p = null;
        q = null;
        m.a(null);
    }

    private void k()
    {
        if (v.b() != 0)
        {
            v.a(0);
        }
        g.w();
        if (s != null)
        {
            gkc.c("vclib", "Releasing WakeLock");
            s.release();
            s = null;
        }
        if (i.isHeld())
        {
            gkc.c("vclib", "Releasing WiFi lock");
            i.release();
        }
    }

    static void k(gbs gbs1)
    {
        if (gbs1.t != null)
        {
            gbs1.t.c(3);
            gbs1.e(1003);
        }
    }

    static boolean l(gbs gbs1)
    {
        return gbs1.d.c();
    }

    gcg a()
    {
        g.w();
        return t;
    }

    void a(char c1, int i1, String s1)
    {
        g.w();
        d.a(c1, i1, s1);
    }

    void a(int i1)
    {
        e(i1);
    }

    public void a(int i1, int j1, byte abyte0[])
    {
        g.w();
        if (q != null)
        {
            q.a(i1, j1, abyte0);
        }
    }

    public void a(int i1, String s1)
    {
        boolean flag;
        flag = false;
        b((new StringBuilder(String.valueOf(s1).length() + 41)).append("CallManager.handleCallEnd: ").append(i1).append(" / ").append(s1).toString(), new Object[0]);
        g.w();
        if (t != null) goto _L2; else goto _L1
_L1:
        if (i1 == 21 || i1 == 22 || i1 == 1003 || i1 == 1015 || i1 == 23 || i1 == 1018)
        {
            flag = true;
        }
        gbh.a(flag);
_L4:
        return;
_L2:
        if (z) goto _L4; else goto _L3
_L3:
        t.a(i1, s1);
        i1 = t.q();
        if (t.s()) goto _L6; else goto _L5
_L5:
        i1 = 0;
_L8:
        if (i1 != 0)
        {
            z = true;
            A = k.a(t.o());
            d.e();
            return;
        } else
        {
            b("CallManager.handleCallEnd - finishing call", new Object[0]);
            j();
            return;
        }
_L6:
        switch (b.g)
        {
        default:
            gbh.a("Unexpected");
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

    public void a(long l1)
    {
        gbh.a(B.containsKey(Long.valueOf(l1)));
        gga gga1 = (gga)B.get(Long.valueOf(l1));
        if (gga1 != null)
        {
            m.a(gga1.a());
        }
    }

    public void a(long l1, String s1, byte abyte0[], int i1)
    {
        m.a(l1, s1, abyte0, i1);
    }

    public void a(long l1, String s1, byte abyte0[], long l2)
    {
        gbh.a(B.containsKey(Long.valueOf(l2)));
        gga gga1 = (gga)B.get(Long.valueOf(l2));
        if (gga1 != null)
        {
            gga1.a(l1, s1, abyte0);
        }
    }

    public void a(Stats stats)
    {
        if (!(stats instanceof com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats)) goto _L2; else goto _L1
_L1:
        com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats connectioninfostats = (com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats)stats;
        int i1 = t.o();
        connectioninfostats.setMediaNetworkType(k.b(i1));
        connectioninfostats.setSignalStrength(k.a(i1));
_L4:
        t.f.a(stats);
        return;
_L2:
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.GlobalStats)
        {
            l.a((com.google.android.libraries.hangouts.video.Stats.GlobalStats)stats);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void a(gci gci1)
    {
        g.w();
        if (!f.contains(gci1))
        {
            f.add(gci1);
        }
    }

    void a(PrintWriter printwriter)
    {
        if (t == null)
        {
            return;
        }
        t.f.a(printwriter);
        if (g())
        {
            printwriter.println("Call info");
            String s1;
            boolean flag;
            if (t != null && t.e())
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
                s1 = "  media state: ".concat(s1);
            } else
            {
                s1 = new String("  media state: ");
            }
            printwriter.println(s1);
            s1 = String.valueOf(t.a);
            if (s1.length() != 0)
            {
                s1 = "    sessionId: ".concat(s1);
            } else
            {
                s1 = new String("    sessionId: ");
            }
            printwriter.println(s1);
            if (t.a() != null)
            {
                s1 = String.valueOf(t.a());
                if (s1.length() != 0)
                {
                    s1 = "    hangoutId: ".concat(s1);
                } else
                {
                    s1 = new String("    hangoutId: ");
                }
                printwriter.println(s1);
            }
        }
        RendererManager.c();
    }

    void a(String s1)
    {
        g.w();
        d.a(s1);
    }

    public void a(String s1, int i1)
    {
        g.w();
        if (g(s1))
        {
            for (Iterator iterator = f.iterator(); iterator.hasNext(); ((gci)iterator.next()).a(s1, i1)) { }
        }
    }

    public void a(String s1, int i1, int j1)
    {
        g.w();
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
        gkc.d("vclib", s1);
_L4:
        return;
_L2:
        String s2;
        int k1 = t.k();
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
            t.f.a();
            t.f.d();
            b(s1, i1);
            return;

        case 2: // '\002'
            gbh.a("This is not expected");
            return;

        case 4: // '\004'
            b(s1, i1);
            return;

        case 6: // '\006'
            t.f.b();
            b(s1, i1);
            return;

        case 9: // '\t'
            b(s1, i1);
            return;

        case 10: // '\n'
            t.d(1007);
            b(s1, i1);
            return;

        case 12: // '\f'
            t.c(j1);
            b(s1, i1);
            t.d(1007);
            return;

        case 13: // '\r'
            t.c(j1);
            b(s1, i1);
            if (k1 == 1)
            {
                t.d(1008);
                return;
            } else
            {
                t.d(1009);
                return;
            }

        case 14: // '\016'
            b(s1, i1);
            t.f.c();
            s1 = f.iterator();
            while (s1.hasNext()) 
            {
                ((gci)s1.next()).a(t);
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
        a(1, ((String) (null)));
        return;
    }

    public void a(String s1, int i1, int j1, String s2, String s3, String s4, byte abyte0[])
    {
        if (gkc.c())
        {
            b("handleEndpointEvent: endpointMucJid=%s eventType=%s, args=%d, %s, %s, %s, participantProto? %b", new Object[] {
                s1, gdv.a(i1), Integer.valueOf(j1), s2, s3, s4, abyte0
            });
        }
        if (t != null) goto _L2; else goto _L1
_L1:
        b("Got endpoint event, but there's no current call. Ignore.", new Object[0]);
_L6:
        return;
_L2:
        Object obj = t.b(s1);
        if (i1 != 0 && i1 != 1) goto _L4; else goto _L3
_L3:
        if (obj != null) goto _L6; else goto _L5
_L5:
        if (abyte0 == null) goto _L8; else goto _L7
_L7:
        obj = (jba)kop.mergeFrom(new jba(), abyte0);
        abyte0 = ((jba) (obj)).e;
_L30:
        String s5;
        s5 = abyte0;
        abyte0 = ((byte []) (obj));
_L19:
        boolean flag = false;
        obj = g.x(s2);
        int k1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            k1 = ((String) (obj)).indexOf('@');
            if (k1 < 0)
            {
                obj = null;
            } else
            {
                obj = ((String) (obj)).substring(k1 + 1);
            }
        }
        if (obj != null && (((String) (obj)).equals("pstn-conference.google.com") || ((String) (obj)).equals("dev-pstn-conference.google.com") || ((String) (obj)).equals("alpha-pstn-conference.google.com") || ((String) (obj)).equals("beta-dev-pstn-conference.google.com")))
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 != 0)
        {
            gbh.a(Integer.valueOf(i1), Integer.valueOf(1));
            s1 = new ghv(s1, s3, j1, s2);
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
            koo koo1;
            if (!flag && t.n() != null)
            {
                flag1 = t.n().x().equals(s2);
            } else
            {
                flag1 = flag;
            }
            s1 = new ghs(s1, s3, s5, j1, s2, flag, flag1, s4);
        }
        if (flag)
        {
            t.a((ghs)s1);
        } else
        {
            t.a(s1);
        }
        s2 = new ghq();
        if (i1 != 0) goto _L10; else goto _L9
_L9:
        if (abyte0 != null)
        {
            q.a(gaw.a.a(abyte0));
        } else
        {
            abyte0 = null;
        }
        if (abyte0 == null) goto _L12; else goto _L11
_L11:
        b("Updating privileges from proto", new Object[0]);
        s3 = ((jba) (abyte0)).s;
        j1 = s3.length;
        i1 = 0;
_L18:
        if (i1 >= j1) goto _L14; else goto _L13
_L13:
        s3[i1];
        JVM INSTR tableswitch 3 4: default 344
    //                   3 494
    //                   4 501;
           goto _L15 _L16 _L17
_L15:
        i1++;
          goto _L18
        obj;
        abyte0 = null;
_L29:
        gkc.c("vclib", "Could not parse participantProto", ((Throwable) (obj)));
        s5 = null;
          goto _L19
_L16:
        s1.t();
          goto _L15
_L17:
        s1.v();
          goto _L15
_L14:
        s3 = s2;
        s2 = s1;
        s1 = s3;
_L20:
        a(((gho) (s2)), ((fyb) (s1)));
        return;
_L12:
        b("Fallback to legacy privileges", new Object[0]);
        s1.t();
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
            gkc.d("vclib", (new StringBuilder(String.valueOf(s1).length() + 71)).append("Got an ENDPOINT_EXITED event for ").append(s1).append(", which doesn't exist in our endpoints").toString());
            return;
        }
        if (TextUtils.isEmpty(s2))
        {
            break MISSING_BLOCK_LABEL_679;
        }
        i1 = Integer.parseInt(s2);
        s1 = Integer.valueOf(i1);
_L21:
        t.b(((gho) (obj)));
        s1 = new ghr(s1);
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
        gkc.d("vclib", s1);
        s1 = null;
          goto _L21
        if (obj == null) goto _L6; else goto _L22
_L22:
        i1;
        JVM INSTR tableswitch 3 6: default 736
    //                   3 751
    //                   4 775
    //                   5 900
    //                   6 948;
           goto _L23 _L24 _L25 _L26 _L27
_L23:
        gbh.a("Unexpected event type");
        s1 = null;
        s2 = ((String) (obj));
          goto _L20
_L24:
        if (!((gho) (obj)).a(j1)) goto _L6; else goto _L28
_L28:
        s1 = new ghn();
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
            s3 = t.b(s2);
        }
        gbh.b(obj, s3);
        s4 = new ghm(flag, s3);
        if (((gho) (obj)).l())
        {
            s1 = s4;
            s2 = ((String) (obj));
            if (s3 != null)
            {
                gbh.a(((ghm)s4).b());
                WebRtcAudioRecord.setMicrophoneMute(flag);
                ((gho) (obj)).a(flag);
                s1 = s4;
                s2 = ((String) (obj));
            }
        } else
        {
            ((gho) (obj)).a(flag);
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
        gbh.a(obj instanceof ghs);
        ((ghs)obj).b(flag);
        s1 = new ghw(flag);
        s2 = ((String) (obj));
          goto _L20
_L27:
        s4 = t.b(s2);
        s3 = new ght(s4);
        if (((gho) (obj)).l())
        {
            s4.r();
            s1 = s3;
            s2 = ((String) (obj));
        } else
        {
            s1 = s3;
            s2 = ((String) (obj));
            if (s4.l())
            {
                ((gho) (obj)).r();
                s1 = s3;
                s2 = ((String) (obj));
            }
        }
          goto _L20
        koo1;
        abyte0 = ((byte []) (obj));
        obj = koo1;
          goto _L29
_L8:
        obj = null;
        abyte0 = null;
          goto _L30
    }

    public void a(String s1, int i1, String s2, String s3)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((gci)iterator.next()).a(s1, i1, s2, s3)) { }
    }

    public void a(String s1, String s2, MediaSources mediasources)
    {
        g.w();
        if (!g(s1))
        {
            return;
        } else
        {
            a(s2, mediasources.a, 0);
            a(s2, mediasources.b, 1);
            a(s2, mediasources.c, 2);
            a(s2, mediasources.d, 3);
            return;
        }
    }

    void a(String s1, String s2, boolean flag, boolean flag1, boolean flag2, byte abyte0[])
    {
        g.w();
        d.a(s1, s2, false, flag1, flag2, abyte0);
    }

    public void a(String s1, boolean flag, String s2, boolean flag1, boolean flag2, String s3)
    {
        t.d(s3);
        for (s3 = f.iterator(); s3.hasNext(); ((gci)s3.next()).a(s1, flag, s2, flag1, flag2)) { }
    }

    void a(boolean flag)
    {
        g.w();
        if (flag != u)
        {
            d.e(flag);
            u = flag;
        }
    }

    void a(boolean flag, String as[], String as1[], int i1, boolean flag1, boolean flag2, String s1)
    {
        g.w();
        d.a(false, as, as1, 1, true, false, null);
    }

    void a(byte abyte0[])
    {
        g.w();
        if (d.c())
        {
            d.handlePushNotification(abyte0);
        }
    }

    public void a(com.google.android.libraries.hangouts.video.ConnectivityReporter.NicInfo anicinfo[])
    {
        anicinfo = ConnectivityReporter.a(anicinfo);
        if (anicinfo != null)
        {
            anicinfo.d = Integer.valueOf(k.b(t.o()));
            anicinfo.e = A;
            if (gkc.a(2))
            {
                gkc.a("vclib", "Connectivity check completed: %s", new Object[] {
                    anicinfo.toString()
                });
            }
            t.a(anicinfo);
        }
        j();
        z = false;
    }

    void a(VideoViewRequest avideoviewrequest[])
    {
        g.w();
        d.a(avideoviewrequest);
    }

    boolean a(gjl gjl1)
    {
        g.w();
        gbh.a(t);
        if (gjl1.a() == null)
        {
            throw new IllegalStateException("No session id provided for call");
        }
        t = new gcg(gjl1);
        Object obj = g.getActiveNetworkInfo();
        if (obj == null)
        {
            gkc.e("vclib", "No network connected");
            t.d(1001);
            j();
            return false;
        }
        gbh.a(s);
        g.w();
        s = ((PowerManager)a.getSystemService("power")).newWakeLock(0x20000001, "vclib");
        gkc.c("vclib", "Acquiring WakeLock");
        s.acquire();
        if (((NetworkInfo) (obj)).getType() == 1)
        {
            gkc.c("vclib", "Acquiring WiFi lock");
            i.acquire();
        }
        t.b(v.c());
        if (gjl1.u())
        {
            obj = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            j = new gcc(this);
            a.registerReceiver(j, ((IntentFilter) (obj)));
        }
        obj = new iqw();
        iqt iqt1;
        int i1;
        if (g.a(gjl1.A().b, false))
        {
            obj.a = Integer.valueOf(27);
        } else
        {
            obj.a = Integer.valueOf(1);
        }
        obj.d = Long.valueOf(b.b);
        iqt1 = new iqt();
        iqt1.a = gjl1.p();
        iqt1.b = gjl1.o();
        iqt1.d = gjl1.b();
        p = new ggl(m, ((iqw) (obj)), iqt1);
        q = new gbd(new gcb(this), p);
        v.b();
        JVM INSTR tableswitch 0 2: default 360
    //                   0 408
    //                   1 425
    //                   2 438;
           goto _L1 _L2 _L3 _L4
_L1:
        i1 = v.b();
        gbh.a((new StringBuilder(37)).append("Unexpected sign-in state: ").append(i1).toString());
        return false;
_L2:
        b("We're not yet signed in; signing in and postponing initiation until done", new Object[0]);
        b(gjl1);
_L6:
        return true;
_L3:
        b("Sign-in in progress. Postponing initiation until done", new Object[0]);
        continue; /* Loop/switch isn't completed */
_L4:
        t.c();
        i();
        if (true) goto _L6; else goto _L5
_L5:
    }

    gdw b()
    {
        g.w();
        return v;
    }

    public void b(int i1)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((gci)iterator.next()).a(i1)) { }
    }

    public void b(long l1, String s1, byte abyte0[], int i1)
    {
        gbh.b(B.containsKey(Long.valueOf(l1)));
        s1 = (new gga()).a(l1, s1, abyte0, i1);
        B.put(Long.valueOf(l1), s1);
    }

    void b(gci gci1)
    {
        g.w();
        f.remove(gci1);
    }

    void b(gjl gjl1)
    {
        ggi ggi1 = ((ggj)hgx.a(a, ggj)).a(gjl1.n());
        v.a(ggi1);
        v.a(1);
        n = new gby(this, ggi1, true, gjl1);
        n.a(new Void[0]);
        g.a(x, w);
    }

    void b(String s1)
    {
        g.w();
        Object obj = y.matcher(s1);
        String s2;
        jbh jbh1;
        if (((Matcher) (obj)).find())
        {
            obj = ((Matcher) (obj)).group(1);
        } else
        {
            obj = null;
        }
        s2 = i(s1);
        jbh1 = new jbh();
        jbh1.a = ((String) (obj));
        jbh1.b = s2;
        jbh1.c = Integer.valueOf(43);
        p.a(jbh1, new gbw(this, s1));
    }

    void b(boolean flag)
    {
        g.w();
        if (t != null)
        {
            if (t.e())
            {
                d.d(flag);
            }
            if (t.e == null)
            {
                throw new IllegalStateException("Mute is allowed only after STATE_INPROGRESS");
            }
            t.e.a(flag);
            g.a(new gbx(this, flag));
        }
    }

    gbd c()
    {
        if (t != null)
        {
            return q;
        } else
        {
            return null;
        }
    }

    public void c(int i1)
    {
        gjs gjs1 = new gjs(i1);
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((gci)iterator.next()).a(gjs1)) { }
    }

    void c(String s1)
    {
        g.w();
        d.b(s1);
    }

    public void c(boolean flag)
    {
        b((new StringBuilder(41)).append("handleSignedInStateUpdate: signedIn=").append(flag).toString(), new Object[0]);
        g.w();
        if (flag)
        {
            v.a(2);
            if (t != null && t.b())
            {
                t.c();
                i();
            }
            return;
        }
        if (v.b() == 1)
        {
            if (v.e())
            {
                a(1000, ((String) (null)));
                return;
            }
            gkc.c("vclib", "Invalidating token.");
            if (v.a() != null)
            {
                v.a().b(a, o);
            }
            o = null;
            v.f();
            n = new gby(this, v.a(), false, null);
            n.a(new Void[0]);
            return;
        } else
        {
            k();
            return;
        }
    }

    public void d()
    {
        if (t != null)
        {
            t.a(true);
        }
    }

    public void d(int i1)
    {
        e(i1);
    }

    void d(String s1)
    {
        d.d(s1);
    }

    public void e()
    {
        if (t != null)
        {
            t.a(false);
        }
    }

    public void e(String s1)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((gci)iterator.next()).b(s1)) { }
    }

    public void f(String s1)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((gci)iterator.next()).c(s1)) { }
    }

    static 
    {
        w = TimeUnit.MINUTES.toMillis(55L);
        C = TimeUnit.SECONDS.toMillis(15L);
    }
}
