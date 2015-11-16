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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public final class gez
{

    final gey a;
    private final Context b;
    private final int c;
    private final int d;
    private final long e;
    private final String f;
    private gmn g;
    private String h;
    private String i;
    private boolean j;
    private int k;
    private int l;
    private String m;
    private String n;
    private String o;
    private iui p;

    gez(gey gey1, Context context, int i1, int j1, long l1, String s)
    {
        a = gey1;
        super();
        b = context;
        c = i1;
        d = j1;
        e = l1;
        f = s;
    }

    private static int a(giq giq1)
    {
        int i1 = Math.max(giq1.c().a, giq1.c().b);
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

    private static gnd a(gnd gnd1, gnd gnd2)
    {
        int i1 = 0;
        gnd gnd3 = new gnd(1200);
        if (gnd2 == null)
        {
            for (; i1 < gnd1.a(); i1++)
            {
                gnd3.a(gnd1.a(i1));
            }

            return gnd3;
        }
        i1 = 0;
        int j1 = 0;
        int k1;
        do
        {
            k1 = j1;
            if (j1 >= gnd1.a())
            {
                break;
            }
            k1 = j1;
            if (i1 >= gnd2.a())
            {
                break;
            }
            if (((gff)gnd1.a(j1)).b < ((gff)gnd2.a(i1)).b)
            {
                gnd3.a(gnd1.a(j1));
                j1++;
            } else
            {
                gnd3.a(gnd2.a(i1));
                i1++;
            }
        } while (true);
        do
        {
            j1 = i1;
            if (k1 >= gnd1.a())
            {
                break;
            }
            gnd3.a(gnd1.a(k1));
            k1++;
        } while (true);
        for (; j1 < gnd2.a(); j1++)
        {
            gnd3.a(gnd2.a(j1));
        }

        return gnd3;
    }

    private static iuu a(int i1, int j1)
    {
        iuu iuu1 = new iuu();
        if (giq.c(j1) == null)
        {
            return null;
        } else
        {
            iuu1.a = Integer.valueOf(i1);
            iuu1.b = Integer.valueOf(a(giq.a(j1)));
            iuu1.d = Integer.valueOf(a(giq.c(j1)));
            return iuu1;
        }
    }

    private void a(String s, itx itx1)
    {
        s = (gfb)a.f.get(s);
        gnd gnd1;
        Object obj;
        ArrayList arraylist;
        int i1;
        int j1;
        long l1;
        boolean flag;
        if (s != null)
        {
            s = ((gfb) (s)).c;
        } else
        {
            s = null;
        }
        s = a(a.g, ((gnd) (s)));
        obj = a.h.c();
        gnd1 = new gnd(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); gnd1.a((gff)((Iterator) (obj)).next())) { }
        obj = a(((gnd) (s)), gnd1);
        gdv.b("Expected non-null", obj);
        j1 = ((gnd) (obj)).a();
        arraylist = new ArrayList();
        s = null;
        l1 = 0x8000000000000000L;
        i1 = 0;
        while (i1 < j1) 
        {
            gff gff1 = (gff)((gnd) (obj)).a(i1);
            String s1;
            if (gff1.b == l1)
            {
                gdv.b("Expected non-null", s);
                s1 = s;
            } else
            {
                s = new itz();
                s.a = Integer.valueOf((int)gff1.b);
                l1 = gff1.b;
                arraylist.add(s);
                s1 = s;
            }
            gff1.c.addTo(s);
            i1++;
            s = s1;
        }
        if (s == null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (j1 == 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (i1 == j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        itx1.i = (itz[])arraylist.toArray(new itz[arraylist.size()]);
    }

    private iur b()
    {
        iur iur1 = new iur();
        iur1.f = Integer.valueOf(gfi.a());
        int i1 = gfi.c();
        if (i1 >= 0)
        {
            iur1.g = Integer.valueOf(i1 / 1000);
        }
        iur1.a = "android";
        iur1.n = android.os.Build.VERSION.RELEASE;
        iur1.u = c();
        iut iut1;
        ArrayList arraylist;
        iuu iuu1;
        int j1;
        int k1;
        try
        {
            iur1.v = b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new RuntimeException(namenotfoundexception);
        }
        iur1.s = String.format("%s/%s", new Object[] {
            Build.DEVICE, Build.MODEL
        });
        iut1 = new iut();
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
        iut1.b = Integer.valueOf(j1);
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
        iut1.a = Integer.valueOf(j1);
        (new gfg()).a(b);
        arraylist = new ArrayList();
        arraylist.add(a(1, 0));
        iuu1 = a(2, 1);
        if (iuu1 != null)
        {
            arraylist.add(iuu1);
        }
        iut1.c = (iuu[])arraylist.toArray(new iuu[arraylist.size()]);
        iur1.w = iut1;
        return iur1;
    }

    private ius c()
    {
        ius ius1;
        int i1;
        int j1;
        int l1;
        int i2;
        j1 = 0;
        i1 = 0;
        ius1 = new ius();
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
        ius1.a = Boolean.valueOf(flag1);
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
        ius1.b = Integer.valueOf((int)(f1 * 25.4F));
        ius1.c = Integer.valueOf((int)(f2 * 25.4F));
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
        gne.a("vclib", "Unable to read camera info", runtimeexception);
        l1 = i1;
        i2 = j1;
_L1:
        ius1.d = Integer.valueOf(l1);
        ius1.e = Integer.valueOf(i2);
        return ius1;
        runtimeexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private jjt c(String s)
    {
        Object obj1;
        jjt jjt1;
        iuf iuf1;
        int i1;
        obj1 = null;
        i1 = 219;
        jjt1 = new jjt();
        jjt1.d = f;
        jjt1.p = Integer.valueOf(59);
        jjt1.j = b();
        iuf1 = new iuf();
        iuf1.f = Integer.valueOf(c);
        iuf1.g = Long.valueOf(e);
        if (!j) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L4:
        if (i1 != '\uFFFF')
        {
            iuf1.a = Integer.valueOf(i1);
        }
        Object obj = new iuq();
        if (g != null)
        {
            if (g.g() != null)
            {
                obj.a = g.g();
                obj.b = g.h();
            } else
            if (g.i() != null)
            {
                obj.d = g.i();
                obj.e = g.j();
            } else
            {
                obj.f = g.f();
            }
        }
        obj.g = Integer.valueOf(d);
        iuf1.b = ((iuq) (obj));
        if (i != null)
        {
            iuf1.d = g.A(i);
        }
        if (d != 1)
        {
            obj = null;
        } else
        if (a.j == 0 && m == null && n == null)
        {
            obj = null;
        } else
        {
            iuo iuo1 = new iuo();
            if (a.j != 0)
            {
                iuo1.c = Integer.valueOf(a.j);
            }
            if (m != null)
            {
                iuo1.a = new iup();
                iuo1.a.a = m;
            }
            obj = iuo1;
            if (n != null)
            {
                iuo1.b = new iup();
                iuo1.b.a = n;
                obj = iuo1;
            }
        }
        iuf1.c = ((iuo) (obj));
        jjt1.k = iuf1;
        jjt1.c = a.c.a();
        if (h != null)
        {
            jjt1.a = h;
        }
        obj = obj1;
        if (i != null)
        {
            jjt1.b = a.c.c();
            obj = g.A(i);
            jjt1.e = g.B(i);
        }
        if (s != null)
        {
            itx itx1 = new itx();
            itx1.a = s;
            SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy", Locale.US);
            simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
            itx1.b = simpledateformat.format(Long.valueOf(a.a));
            if (a.l != 0)
            {
                itx1.d = Integer.valueOf(a.l);
            }
            i1 = -1000;
            if (a.b > 0L)
            {
                int j1 = (int)(SystemClock.elapsedRealtime() - a.b);
                i1 = j1;
                if (a.e > 0L)
                {
                    itx1.e = Long.valueOf(a.e - a.b);
                    i1 = j1;
                    if (a.d > 0L)
                    {
                        itx1.f = Long.valueOf(a.d - a.e);
                        i1 = j1;
                    }
                }
            }
            itx1.c = Integer.valueOf(i1 / 1000);
            itx1.g = ((String) (obj));
            itx1.j = Boolean.valueOf(a.i);
            itx1.k = Integer.valueOf(l);
            obj = (gfb)a.f.get(s);
            if (obj == null)
            {
                i1 = k;
            } else
            {
                if (!((gfb) (obj)).a)
                {
                    obj.a = true;
                    obj.b = k;
                }
                i1 = ((gfb) (obj)).b;
            }
            itx1.l = Integer.valueOf(gey.d(i1));
            if (o != null)
            {
                itx1.m = o;
            }
            a(s, itx1);
            jjt1.f = itx1;
        }
        if (a.m != 0)
        {
            if (a.k == null)
            {
                a.k = new ium();
            }
            a.k.b = Integer.valueOf(a.m);
        }
        if (a.k != null)
        {
            jjt1.m = a.k;
        }
        jjt1.h = p;
        jjt1.t = Long.valueOf(System.currentTimeMillis());
        return jjt1;
_L2:
        switch (k)
        {
        default:
            i1 = k;
            gdv.a((new StringBuilder(45)).append("startupEntry unexpected endCause: ").append(i1).toString());
            i1 = -1;
            break;

        case 0: // '\0'
            gdv.a("endCause is not set");
            i1 = -1;
            break;

        case 1: // '\001'
            i1 = 302;
            break;

        case 1016: 
            i1 = 318;
            break;

        case 2: // '\002'
            if (g == null || g.g() != null || g.i() != null)
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

        case 21: // '\025'
        case 22: // '\026'
            i1 = 305;
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

        case 1003: 
            i1 = 305;
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
            iuf1.h = o;
            break;

        case 30: // '\036'
        case 1004: 
        case 1007: 
        case 1009: 
        case 1013: 
            break;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public gez a(gmn gmn1)
    {
        g = gmn1;
        return this;
    }

    public gez a(iui iui)
    {
        p = iui;
        return this;
    }

    public gez a(String s)
    {
        h = s;
        return this;
    }

    public gez a(String s, String s1, String s2)
    {
        m = s;
        n = s1;
        o = s2;
        return this;
    }

    public gez a(boolean flag, int i1, int j1)
    {
        j = flag;
        k = i1;
        l = j1;
        return this;
    }

    public List a()
    {
        gdv.a();
        ArrayList arraylist = new ArrayList();
        if (a.f.isEmpty() && a.h.b())
        {
            arraylist.add(c(a.c.b()));
        } else
        {
            Object obj;
            boolean flag;
            if (a.f.size() <= 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gdv.a("Expected condition to be true", flag);
            obj = a.c.d();
            if (!a.f.containsKey(obj) && !a.h.b())
            {
                arraylist.add(c(((String) (obj))));
            }
            obj = a.f.keySet().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                arraylist.add(c((String)((Iterator) (obj)).next()));
            }
        }
        return arraylist;
    }

    public gez b(String s)
    {
        i = s;
        return this;
    }
}
