// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.voiceengine.WebRtcAudioRecord;
import org.webrtc.voiceengine.WebRtcAudioTrack;

public final class gir
    implements gji, gjj
{

    final Context a;
    final AudioManager b;
    final gjb c = new gjb(this);
    final Object d = new Object();
    boolean e;
    boolean f;
    giv g;
    giw h;
    final Set i = new CopyOnWriteArraySet();
    gja j;
    BluetoothAdapter k;
    BluetoothHeadset l;
    giy m;
    BluetoothDevice n;
    giw o;
    private final Runnable p = new gix(this);
    private gbn q;
    private boolean r;
    private boolean s;
    private final Runnable t = new gis(this);

    public gir(Context context, boolean flag)
    {
        h = giw.a;
        a = context;
        b = (AudioManager)context.getSystemService("audio");
        if (j())
        {
            i.add(giv.b);
        }
        i.add(giv.a);
        if (flag || !j())
        {
            context = giv.a;
        } else
        {
            context = giv.b;
        }
        g = context;
    }

    private void b(boolean flag)
    {
        boolean flag1 = b.isSpeakerphoneOn();
        gkc.b("vclib", (new StringBuilder(37)).append("setSpeakerphoneOn(").append(flag).append("), wasOn=").append(flag1).toString());
        b.setSpeakerphoneOn(flag);
    }

    private boolean k()
    {
        gkc.b("vclib", "turnOffBluetooth");
        if (h != giw.d && h != giw.e)
        {
            String s1 = String.valueOf(h);
            gkc.b("vclib", (new StringBuilder(String.valueOf(s1).length() + 52)).append("turnOffBluetooth: state is already ").append(s1).append(", cannot turn off").toString());
            return false;
        } else
        {
            f();
            return true;
        }
    }

    public void a()
    {
        synchronized (d)
        {
            if (e)
            {
                gkc.b("vclib", "releaseBluetoothAudio");
                if (k != null)
                {
                    f();
                    h();
                    a.unregisterReceiver(m);
                    m = null;
                    k.closeProfileProxy(1, l);
                    l = null;
                    n = null;
                    k = null;
                }
                gkc.b("vclib", "releaseWiredHeadsetAudio");
                a.unregisterReceiver(c);
                b.setMode(0);
                b.abandonAudioFocus(null);
                boolean flag = f;
                gkc.c("vclib", (new StringBuilder(42)).append("Restoring saved speakerphone state to").append(flag).toString());
                b(f);
                e = false;
            }
        }
        q = null;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(giv giv1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        giu.a[giv1.ordinal()];
        JVM INSTR tableswitch 1 4: default 265
    //                   1 51
    //                   2 148
    //                   3 187
    //                   4 226;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        d();
        return;
_L2:
        o = h;
        gkc.b("vclib", "turnOnBluetooth");
        if (h != giw.d && h != giw.e) goto _L7; else goto _L6
_L6:
        giv1 = String.valueOf(h);
        gkc.b("vclib", (new StringBuilder(String.valueOf(giv1).length() + 50)).append("turnOnBluetooth: state is already ").append(giv1).append(", cannot turn on").toString());
          goto _L1
        giv1;
        obj;
        JVM INSTR monitorexit ;
        throw giv1;
_L7:
        e();
          goto _L1
_L3:
        if (e && !k()) goto _L9; else goto _L8
_L8:
        o = giw.a;
_L10:
        b(true);
          goto _L1
_L9:
        h = giw.a;
          goto _L10
_L4:
        if (e && !k()) goto _L12; else goto _L11
_L11:
        o = giw.c;
_L13:
        b(false);
          goto _L1
_L12:
        h = giw.c;
          goto _L13
_L5:
        if (e && !k()) goto _L15; else goto _L14
_L14:
        o = giw.b;
_L16:
        b(false);
          goto _L1
_L15:
        h = giw.b;
          goto _L16
    }

    public void a(gja gja)
    {
        j = gja;
    }

    public void a(gjk gjk)
    {
        if (q == null)
        {
            gbh.a("Must use CallClient", gjk instanceof gbn);
            q = (gbn)gjk;
            synchronized (d)
            {
                if (!e)
                {
                    if (android.os.Build.VERSION.SDK_INT == 15)
                    {
                        k = BluetoothAdapter.getDefaultAdapter();
                    }
                    gbk.a(p);
                }
                a(r);
                c_(s);
            }
            return;
        } else
        {
            return;
        }
        exception;
        gjk;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(boolean flag)
    {
        boolean flag2;
        flag2 = true;
        r = flag;
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        gbn gbn1;
        Exception exception;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        WebRtcAudioRecord.setMicrophoneMute(flag1);
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gkc.b("vclib", (new StringBuilder(33)).append("Setting audio mute state to ").append(flag1).toString());
        gbn1 = q;
        if (!flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        gbn1.b(flag);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public giw b()
    {
        return h;
    }

    public Set c()
    {
        return i;
    }

    public void c_(boolean flag)
    {
        s = flag;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WebRtcAudioTrack.setAudioMute(flag);
    }

    void d()
    {
        String s1 = String.valueOf(h);
        String s2 = String.valueOf(i);
        gkc.b("vclib", (new StringBuilder(String.valueOf(s1).length() + 30 + String.valueOf(s2).length())).append("reportUpdate: state=").append(s1).append(", devices=").append(s2).toString());
        g.a(new git(this));
    }

    void e()
    {
        gkc.b("vclib", "startBluetoothSco");
        h();
        if (l != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (n == null)
        {
            List list = l.getConnectedDevices();
            if (list.size() > 0)
            {
                n = (BluetoothDevice)list.get(0);
            }
        }
        if (n == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            break; /* Loop/switch isn't completed */
        }
        gkc.b("vclib", "startBluetoothSco : JBMR2+ Workaround");
        Object obj;
        obj = Class.forName(l.getClass().getName()).getDeclaredMethod("startScoUsingVirtualVoiceCall", new Class[] {
            android/bluetooth/BluetoothDevice
        });
        ((Method) (obj)).setAccessible(true);
        obj = (Boolean)((Method) (obj)).invoke(l, new Object[] {
            n
        });
        if (obj != null)
        {
            try
            {
                if (((Boolean) (obj)).booleanValue())
                {
                    h = giw.e;
                }
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                gbh.a(classnotfoundexception.toString());
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                gbh.a(nosuchmethodexception.toString());
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                gbh.a(invocationtargetexception.toString());
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                gbh.a(illegalaccessexception.toString());
            }
        }
        gkc.b("vclib", "done");
_L4:
        if (h == giw.e)
        {
            d();
            g();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        gkc.b("vclib", "startBluetoothSco : pre-JBMR2");
        b.startBluetoothSco();
        h = giw.e;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    void f()
    {
        gkc.b("vclib", "stopBluetoothSco");
        h();
        break MISSING_BLOCK_LABEL_12;
_L2:
        do
        {
            return;
        } while (l == null || n == null);
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj;
        gkc.b("vclib", "stopBluetoothSco : JBMR2+ Workaround");
        obj = Class.forName(l.getClass().getName()).getDeclaredMethod("stopScoUsingVirtualVoiceCall", new Class[] {
            android/bluetooth/BluetoothDevice
        });
        ((Method) (obj)).setAccessible(true);
        obj = (Boolean)((Method) (obj)).invoke(l, new Object[] {
            n
        });
        if (obj != null)
        {
            try
            {
                if (((Boolean) (obj)).booleanValue())
                {
                    h = giw.f;
                }
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                gbh.a(classnotfoundexception.toString());
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                gbh.a(nosuchmethodexception.toString());
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                gbh.a(invocationtargetexception.toString());
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                gbh.a(illegalaccessexception.toString());
            }
        }
        gkc.b("vclib", "done");
_L3:
        if (h == giw.f)
        {
            d();
            g();
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        gkc.b("vclib", "stopBluetoothSco : pre-JBMR2");
        b.stopBluetoothSco();
        h = giw.f;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    void g()
    {
        gkc.b("vclib", "Starting bluetooth timer");
        g.a(t, 5000L);
    }

    void h()
    {
        gkc.b("vclib", "Canceling bluetooth timer");
        Runnable runnable = t;
        g.y().removeCallbacks(runnable);
    }

    void i()
    {
        if (o == null || o == giw.c && !i.contains(giv.d))
        {
            String s1 = String.valueOf("usePendingAudioDeviceState: there's no pending state or it was WH, but has been unplugged; using default device. Pending state was ");
            String s3 = String.valueOf(o);
            gkc.e("vclib", (new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(s3).length())).append(s1).append(s3).toString());
            o = null;
            a(g);
            return;
        }
        String s2 = String.valueOf(o);
        gkc.b("vclib", (new StringBuilder(String.valueOf(s2).length() + 34)).append("usePendingAudioDeviceState: using ").append(s2).toString());
        h = o;
        o = null;
        boolean flag;
        if (h == giw.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
        d();
    }

    boolean j()
    {
        return gkj.a((TelephonyManager)a.getSystemService("phone"));
    }
}
