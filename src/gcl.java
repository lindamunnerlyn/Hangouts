// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.libraries.hangouts.video.DecoderManager;
import com.google.android.libraries.hangouts.video.EncoderManager;
import com.google.android.libraries.hangouts.video.Stats;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public final class gcl
{

    final gck a;
    private final Context b;
    private final String c;
    private final int d;
    private final int e;
    private final long f;
    private final String g;
    private gjl h;
    private String i;
    private String j;
    private boolean k;
    private int l;
    private int m;
    private String n;
    private String o;
    private String p;
    private iod q;

    gcl(gck gck1, Context context, String s, int i1, int j1, long l1, 
            String s1)
    {
        a = gck1;
        super();
        b = context;
        c = s;
        d = i1;
        e = j1;
        f = l1;
        g = s1;
    }

    private static int a(gfq gfq1)
    {
        int i1 = Math.max(gfq1.c().a, gfq1.c().b);
        if (i1 > 1920)
        {
            return 6;
        }
        if (i1 > 1280)
        {
            return 5;
        }
        if (i1 > 960)
        {
            return 4;
        }
        if (i1 > 640)
        {
            return 3;
        }
        return i1 <= 320 ? 1 : 2;
    }

    private static iop a(int i1, int j1)
    {
        iop iop1 = new iop();
        if (gfq.c(j1) == null)
        {
            return null;
        } else
        {
            iop1.a = Integer.valueOf(i1);
            iop1.b = Integer.valueOf(a(gfq.a(j1)));
            iop1.c = Integer.valueOf(a(gfq.c(j1)));
            return iop1;
        }
    }

    private iom b()
    {
        iom iom1 = new iom();
        iom1.f = Integer.valueOf(gkj.a());
        int i1 = gkj.c();
        if (i1 >= 0)
        {
            iom1.g = Integer.valueOf(i1 / 1000);
        }
        iom1.a = "android";
        iom1.n = android.os.Build.VERSION.RELEASE;
        iom1.u = c();
        Object obj;
        ArrayList arraylist;
        iop iop1;
        int j1;
        int k1;
        try
        {
            obj = b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new RuntimeException(namenotfoundexception);
        }
        iom1.v = ((String) (obj));
        iom1.s = String.format("%s/%s", new Object[] {
            Build.DEVICE, Build.MODEL
        });
        obj = new ioo();
        k1 = EncoderManager.a(b);
        if ((k1 & 1) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if ((k1 & 2) != 0)
        {
            j1 = i1 | 2;
        }
        obj.b = Integer.valueOf(j1);
        k1 = DecoderManager.a(b);
        if ((k1 & 1) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if ((k1 & 2) != 0)
        {
            j1 = i1 | 2;
        }
        obj.a = Integer.valueOf(j1);
        (new gco()).a(b);
        arraylist = new ArrayList();
        arraylist.add(a(1, 0));
        iop1 = a(2, 1);
        if (iop1 != null)
        {
            arraylist.add(iop1);
        }
        obj.c = (iop[])arraylist.toArray(new iop[arraylist.size()]);
        iom1.w = ((ioo) (obj));
        return iom1;
    }

    private ins c(String s)
    {
        ins ins1;
        ins1 = new ins();
        ins1.a = a.c.b();
        SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy", Locale.US);
        simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
        ins1.b = simpledateformat.format(Long.valueOf(a.a));
        if (a.j != 0)
        {
            ins1.d = Integer.valueOf(a.j);
        }
        int i1 = -1000;
        if (a.b > 0L)
        {
            int k1 = (int)(SystemClock.elapsedRealtime() - a.b);
            i1 = k1;
            if (a.e > 0L)
            {
                ins1.e = Long.valueOf(a.e - a.b);
                i1 = k1;
                if (a.d > 0L)
                {
                    ins1.f = Long.valueOf(a.d - a.e);
                    i1 = k1;
                }
            }
        }
        ins1.c = Integer.valueOf(i1 / 1000);
        ins1.g = s;
        ins1.j = Boolean.valueOf(a.g);
        ins1.k = Integer.valueOf(m);
        ins1.l = Integer.valueOf(gck.d(l));
        if (p != null)
        {
            ins1.m = p;
        }
        gkb gkb1 = a.f;
        gkb1;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        int l1;
        l1 = a.f.a();
        arraylist = new ArrayList();
        int j1;
        long l2;
        l2 = 0x8000000000000000L;
        j1 = 0;
        s = null;
_L9:
        if (j1 >= l1) goto _L2; else goto _L1
_L1:
        gcn gcn1 = (gcn)a.f.a(j1);
        if (gcn1.b != l2) goto _L4; else goto _L3
_L3:
        gbh.b(s);
        String s1 = s;
_L6:
        gcn1.c.addTo(s1);
        j1++;
        continue; /* Loop/switch isn't completed */
_L4:
        s = new inu();
        s.a = Integer.valueOf((int)gcn1.b);
        l2 = gcn1.b;
        arraylist.add(s);
        s1 = s;
        if (true) goto _L6; else goto _L5
_L5:
        boolean flag1;
        gbh.a(flag1);
        ins1.i = (inu[])arraylist.toArray(new inu[arraylist.size()]);
        gkb1;
        JVM INSTR monitorexit ;
        return ins1;
        s;
        gkb1;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        boolean flag;
        if (s == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l1 == 0)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (flag == l1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (true) goto _L5; else goto _L7
_L7:
        if (true) goto _L9; else goto _L8
_L8:
    }

    private ion c()
    {
        ion ion1;
        int i1;
        int j1;
        int l1;
        int i2;
        j1 = 0;
        i1 = 0;
        ion1 = new ion();
        float f1;
        float f2;
        Object obj;
        DisplayMetrics displaymetrics;
        int k1;
        int j2;
        boolean flag1;
        if (((TelephonyManager)b.getSystemService("phone")).getPhoneType() != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ion1.a = Boolean.valueOf(flag1);
        obj = (WindowManager)b.getSystemService("window");
        displaymetrics = new DisplayMetrics();
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            ((WindowManager) (obj)).getDefaultDisplay().getRealMetrics(displaymetrics);
        } else
        {
            ((WindowManager) (obj)).getDefaultDisplay().getMetrics(displaymetrics);
        }
        f1 = (float)displaymetrics.widthPixels / displaymetrics.xdpi;
        f2 = (float)displaymetrics.heightPixels / displaymetrics.ydpi;
        ion1.b = Integer.valueOf((int)(f1 * 25.4F));
        ion1.c = Integer.valueOf((int)(f2 * 25.4F));
        obj = new android.hardware.Camera.CameraInfo();
        j2 = Camera.getNumberOfCameras();
        k1 = 0;
        j1 = 0;
_L2:
        i2 = j1;
        l1 = i1;
        if (k1 >= j2)
        {
            break; /* Loop/switch isn't completed */
        }
        Camera.getCameraInfo(k1, ((android.hardware.Camera.CameraInfo) (obj)));
        l1 = ((android.hardware.Camera.CameraInfo) (obj)).facing;
        if (l1 == 1)
        {
            i1++;
        } else
        {
            j1++;
        }
        k1++;
        if (true) goto _L2; else goto _L1
        RuntimeException runtimeexception;
        runtimeexception;
        boolean flag = false;
        i1 = j1;
        j1 = ((flag) ? 1 : 0);
_L4:
        gkc.b("vclib", "Unable to read camera info", runtimeexception);
        l1 = i1;
        i2 = j1;
_L1:
        ion1.d = Integer.valueOf(l1);
        ion1.e = Integer.valueOf(i2);
        return ion1;
        runtimeexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public gcl a(gjl gjl1)
    {
        h = gjl1;
        return this;
    }

    public gcl a(iod iod)
    {
        q = iod;
        return this;
    }

    public gcl a(String s)
    {
        i = s;
        return this;
    }

    public gcl a(String s, String s1, String s2)
    {
        n = s;
        o = s1;
        p = s2;
        return this;
    }

    public gcl a(boolean flag, int i1, int j1)
    {
        k = flag;
        l = i1;
        m = j1;
        return this;
    }

    public jdh a()
    {
        Object obj;
        jdh jdh1;
        ioa ioa1;
        int i1;
        obj = null;
        i1 = 305;
        jdh1 = new jdh();
        jdh1.d = g;
        jdh1.p = Integer.valueOf(59);
        jdh1.j = b();
        ioa1 = new ioa();
        ioa1.f = Integer.valueOf(d);
        ioa1.g = Long.valueOf(f);
        if (!k) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L8:
        if (i1 != '\uFFFF')
        {
            ioa1.a = Integer.valueOf(i1);
        }
        iol iol1 = new iol();
        if (h != null)
        {
            if (h.g() != null)
            {
                iol1.a = h.g();
                iol1.b = h.h();
            } else
            if (h.i() != null)
            {
                iol1.d = h.i();
                iol1.e = h.j();
            } else
            {
                iol1.f = h.f();
            }
        }
        iol1.g = Integer.valueOf(e);
        ioa1.b = iol1;
        if (j != null)
        {
            ioa1.d = g.x(j);
        }
          goto _L3
_L6:
        ioa1.c = ((ioj) (obj));
        jdh1.k = ioa1;
        jdh1.c = a.c.a();
        if (i != null)
        {
            jdh1.a = i;
        }
        if (j != null)
        {
            jdh1.b = a.c.c();
            obj = g.x(j);
            jdh1.e = g.y(j);
            if (k)
            {
                jdh1.f = c(((String) (obj)));
            }
        }
        if (a.k != 0)
        {
            if (a.i == null)
            {
                a.i = new ioh();
            }
            a.i.b = Integer.valueOf(a.k);
        }
        if (a.i != null)
        {
            jdh1.m = a.i;
        }
        jdh1.h = q;
        jdh1.t = Long.valueOf(System.currentTimeMillis());
        return jdh1;
_L2:
        switch (l)
        {
        default:
            i1 = l;
            gbh.a((new StringBuilder(45)).append("startupEntry unexpected endCause: ").append(i1).toString());
            i1 = -1;
            break;

        case 0: // '\0'
            gbh.a("endCause is not set");
            i1 = -1;
            break;

        case 1: // '\001'
            i1 = 302;
            break;

        case 1016: 
            i1 = 318;
            break;

        case 2: // '\002'
            if (h == null || h.g() != null || h.i() != null)
            {
                i1 = 306;
            } else
            {
                i1 = 217;
            }
            break;

        case 3: // '\003'
            i1 = 304;
            break;

        case 4: // '\004'
            i1 = 308;
            break;

        case 5: // '\005'
            i1 = 309;
            break;

        case 6: // '\006'
            i1 = 310;
            break;

        case 7: // '\007'
            i1 = 312;
            break;

        case 8: // '\b'
            i1 = 313;
            break;

        case 9: // '\t'
            i1 = 314;
            break;

        case 11: // '\013'
            i1 = 316;
            break;

        case 12: // '\f'
            i1 = 201;
            break;

        case 13: // '\r'
            i1 = 202;
            break;

        case 14: // '\016'
            i1 = 216;
            break;

        case 15: // '\017'
            i1 = 307;
            break;

        case 16: // '\020'
            i1 = 303;
            break;

        case 17: // '\021'
            i1 = 212;
            break;

        case 19: // '\023'
        case 26: // '\032'
            i1 = 218;
            break;

        case 20: // '\024'
            i1 = 206;
            break;

        case 1000: 
            i1 = 300;
            break;

        case 1001: 
            i1 = 210;
            break;

        case 1002: 
            i1 = 208;
            break;

        case 1004: 
            i1 = 219;
            break;

        case 30: // '\036'
            i1 = 219;
            break;

        case 1005: 
            i1 = 229;
            break;

        case 18: // '\022'
            i1 = 209;
            break;

        case 28: // '\034'
            i1 = 223;
            break;

        case 1007: 
        case 1009: 
        case 1013: 
            i1 = 219;
            break;

        case 1011: 
            i1 = 100;
            break;

        case 1010: 
            i1 = 102;
            break;

        case 1006: 
            i1 = 230;
            break;

        case 1015: 
        case 1018: 
            i1 = 317;
            break;

        case 1017: 
            i1 = 319;
            ioa1.h = p;
            break;

        case 21: // '\025'
        case 22: // '\026'
        case 1003: 
            break;
        }
          goto _L4
_L3:
        if (e != 1 || a.h == 0 && n == null && o == null) goto _L6; else goto _L5
_L5:
        ioj ioj1 = new ioj();
        if (a.h != 0)
        {
            ioj1.c = Integer.valueOf(a.h);
        }
        if (n != null)
        {
            ioj1.a = new iok();
            ioj1.a.a = n;
        }
        obj = ioj1;
        if (o != null)
        {
            ioj1.b = new iok();
            ioj1.b.a = o;
            obj = ioj1;
        }
        if (true) goto _L6; else goto _L4
_L4:
        if (true) goto _L8; else goto _L7
_L7:
    }

    public gcl b(String s)
    {
        j = s;
        return this;
    }
}
