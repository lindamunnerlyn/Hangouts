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

public final class glt
    implements gmk, gml
{

    final Context a;
    final AudioManager b;
    final gmd c = new gmd(this);
    final Object d = new Object();
    boolean e;
    boolean f;
    glx g;
    gly h;
    final Set i = new CopyOnWriteArraySet();
    gmc j;
    BluetoothAdapter k;
    BluetoothHeadset l;
    gma m;
    BluetoothDevice n;
    gly o;
    private final Runnable p = new glz(this);
    private geb q;
    private boolean r;
    private boolean s;
    private final Runnable t = new glu(this);

    public glt(Context context, boolean flag)
    {
        h = gly.a;
        a = context;
        b = (AudioManager)context.getSystemService("audio");
        if (j())
        {
            i.add(glx.b);
        }
        i.add(glx.a);
        if (flag || !j())
        {
            context = glx.a;
        } else
        {
            context = glx.b;
        }
        g = context;
    }

    private static boolean a(TelephonyManager telephonymanager)
    {
        telephonymanager = (Boolean)Class.forName(telephonymanager.getClass().getName()).getDeclaredMethod("isVoiceCapable", new Class[0]).invoke(telephonymanager, new Object[0]);
_L1:
        return telephonymanager != null && telephonymanager.booleanValue();
        telephonymanager;
_L2:
        gdv.a(telephonymanager.toString());
        telephonymanager = null;
          goto _L1
        telephonymanager;
          goto _L2
        telephonymanager;
          goto _L2
        telephonymanager;
          goto _L2
    }

    private void b(boolean flag)
    {
        boolean flag1 = b.isSpeakerphoneOn();
        gne.a(3, "vclib", (new StringBuilder(37)).append("setSpeakerphoneOn(").append(flag).append("), wasOn=").append(flag1).toString());
        b.setSpeakerphoneOn(flag);
    }

    private boolean k()
    {
        gne.a(3, "vclib", "turnOffBluetooth");
        if (h != gly.d && h != gly.e)
        {
            String s1 = String.valueOf(h);
            gne.a(3, "vclib", (new StringBuilder(String.valueOf(s1).length() + 52)).append("turnOffBluetooth: state is already ").append(s1).append(", cannot turn off").toString());
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
                gne.a(3, "vclib", "releaseBluetoothAudio");
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
                gne.a(3, "vclib", "releaseWiredHeadsetAudio");
                a.unregisterReceiver(c);
                b.setMode(0);
                b.abandonAudioFocus(null);
                boolean flag = f;
                gne.a(4, "vclib", (new StringBuilder(42)).append("Restoring saved speakerphone state to").append(flag).toString());
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

    public void a(glx glx1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        glw.a[glx1.ordinal()];
        JVM INSTR tableswitch 1 4: default 270
    //                   1 51
    //                   2 153
    //                   3 192
    //                   4 231;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        d();
        return;
_L2:
        o = h;
        gne.a(3, "vclib", "turnOnBluetooth");
        if (h != gly.d && h != gly.e) goto _L7; else goto _L6
_L6:
        glx1 = String.valueOf(h);
        gne.a(3, "vclib", (new StringBuilder(String.valueOf(glx1).length() + 50)).append("turnOnBluetooth: state is already ").append(glx1).append(", cannot turn on").toString());
          goto _L1
        glx1;
        obj;
        JVM INSTR monitorexit ;
        throw glx1;
_L7:
        e();
          goto _L1
_L3:
        if (e && !k()) goto _L9; else goto _L8
_L8:
        o = gly.a;
_L10:
        b(true);
          goto _L1
_L9:
        h = gly.a;
          goto _L10
_L4:
        if (e && !k()) goto _L12; else goto _L11
_L11:
        o = gly.c;
_L13:
        b(false);
          goto _L1
_L12:
        h = gly.c;
          goto _L13
_L5:
        if (e && !k()) goto _L15; else goto _L14
_L14:
        o = gly.b;
_L16:
        b(false);
          goto _L1
_L15:
        h = gly.b;
          goto _L16
    }

    public void a(gmc gmc)
    {
        j = gmc;
    }

    public void a(gmm gmm)
    {
        if (q == null)
        {
            gdv.a("Must use CallClient", gmm instanceof geb);
            q = (geb)gmm;
            synchronized (d)
            {
                if (!e)
                {
                    if (android.os.Build.VERSION.SDK_INT == 15)
                    {
                        k = BluetoothAdapter.getDefaultAdapter();
                    }
                    gdy.a(p);
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
        gmm;
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
            break MISSING_BLOCK_LABEL_87;
        }
        geb geb1;
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
        gne.a(3, "vclib", (new StringBuilder(33)).append("Setting audio mute state to ").append(flag1).toString());
        geb1 = q;
        if (!flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        geb1.a(flag);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public gly b()
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
        gne.a(3, "vclib", (new StringBuilder(String.valueOf(s1).length() + 30 + String.valueOf(s2).length())).append("reportUpdate: state=").append(s1).append(", devices=").append(s2).toString());
        g.a(new glv(this));
    }

    void e()
    {
        gne.a(3, "vclib", "startBluetoothSco");
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
        gne.a(3, "vclib", "startBluetoothSco : JBMR2+ Workaround");
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
                    h = gly.e;
                }
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                gdv.a(classnotfoundexception.toString());
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                gdv.a(nosuchmethodexception.toString());
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                gdv.a(invocationtargetexception.toString());
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                gdv.a(illegalaccessexception.toString());
            }
        }
        gne.a(3, "vclib", "done");
_L4:
        if (h == gly.e)
        {
            d();
            g();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        gne.a(3, "vclib", "startBluetoothSco : pre-JBMR2");
        b.startBluetoothSco();
        h = gly.e;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    void f()
    {
        gne.a(3, "vclib", "stopBluetoothSco");
        h();
        break MISSING_BLOCK_LABEL_13;
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
        gne.a(3, "vclib", "stopBluetoothSco : JBMR2+ Workaround");
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
                    h = gly.f;
                }
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                gdv.a(classnotfoundexception.toString());
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                gdv.a(nosuchmethodexception.toString());
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                gdv.a(invocationtargetexception.toString());
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                gdv.a(illegalaccessexception.toString());
            }
        }
        gne.a(3, "vclib", "done");
_L3:
        if (h == gly.f)
        {
            d();
            g();
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        gne.a(3, "vclib", "stopBluetoothSco : pre-JBMR2");
        b.stopBluetoothSco();
        h = gly.f;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    void g()
    {
        gne.a(3, "vclib", "Starting bluetooth timer");
        g.a(t, 5000L);
    }

    void h()
    {
        gne.a(3, "vclib", "Canceling bluetooth timer");
        Runnable runnable = t;
        g.x().removeCallbacks(runnable);
    }

    void i()
    {
        if (o == null || o == gly.c && !i.contains(glx.d))
        {
            String s1 = String.valueOf("usePendingAudioDeviceState: there's no pending state or it was WH, but has been unplugged; using default device. Pending state was ");
            String s3 = String.valueOf(o);
            gne.a(6, "vclib", (new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(s3).length())).append(s1).append(s3).toString());
            o = null;
            a(g);
            return;
        }
        String s2 = String.valueOf(o);
        gne.a(3, "vclib", (new StringBuilder(String.valueOf(s2).length() + 34)).append("usePendingAudioDeviceState: using ").append(s2).toString());
        h = o;
        o = null;
        boolean flag;
        if (h == gly.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
        d();
    }

    public boolean j()
    {
        TelephonyManager telephonymanager = (TelephonyManager)a.getSystemService("phone");
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            return a(telephonymanager);
        }
        return telephonymanager.getPhoneType() != 0;
    }
}
