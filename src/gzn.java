// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class gzn extends hhr
    implements gxm, gzl
{

    private gzv b;
    private final hao c;
    private final int d;
    private final HashMap e;
    private final HashSet f;
    private final he g;
    private final hab h;
    private long i;
    private final gyr j;
    private final gyr k;
    private final int l;
    private final gzd m[];
    private final hgk n;
    private float o;
    private int p;
    private int q;
    private int r;
    private int s;

    protected gzn(Context context, ham ham1)
    {
        super(context);
        e = new HashMap();
        f = new HashSet();
        l = g.M(context);
        hak hak1 = ham1.b();
        j = new gyr(context, hak1.a, hak1.b, hak1.c, hak1.d, hak1.e);
        hak1 = ham1.c();
        k = new gyr(context, hak1.a, hak1.b, hak1.c, hak1.d, hak1.e);
        c = ham1.a();
        d = (int)((double)c.a * 0.75D);
        g = new gzp(this, c.a);
        ham1 = g.K(context);
        o = Math.min(240F / ((DisplayMetrics) (ham1)).xdpi, 1.0F);
        p = Math.max(((DisplayMetrics) (ham1)).heightPixels, ((DisplayMetrics) (ham1)).widthPixels);
        if (p == 0)
        {
            p = 640;
        }
        q = (int)((float)p * 0.2F * o);
        r = (int)((float)p * 0.5F);
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L2; else goto _L1
_L1:
        ham1 = null;
_L4:
        h = ham1;
        ham1 = hlp.c(context, gzd);
        m = (gzd[])ham1.toArray(new gzd[ham1.size()]);
        Arrays.sort(m, new gzo(this));
        int i1 = context.getApplicationContext().getResources().getInteger(g.ta);
        if (l >= 256)
        {
            i1 = 0x1000000;
        }
        s = i1;
        n = (hgk)hlp.b(context, hgk);
        if (Log.isLoggable("ImageResourceManager", 3))
        {
            ham1 = new gzr(this, new StringWriter());
            a(ham1);
            g.a(4, "ImageResourceManager", ham1.toString());
        }
        ham1 = hlp.b(context);
        ham1.b(gxm, this);
        if (h != null)
        {
            ham1.b(gxm, h);
        }
        ham1 = new IntentFilter();
        ham1.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        gzb gzb1 = new gzb();
        context.getApplicationContext().registerReceiver(gzb1, ham1);
        context.registerComponentCallbacks(new gzm(context));
        return;
_L2:
        hab hab1 = new hab(c.c);
        ham1 = hab1;
        if (c.f)
        {
            b = new gzv(c, hab1, f(), e());
            g.a(new gzq(this));
            ham1 = hab1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static gzv a(gzn gzn1)
    {
        return gzn1.b;
    }

    public int a()
    {
        return s;
    }

    public Bitmap a(int i1, int j1)
    {
        Bitmap bitmap = null;
        if (h != null)
        {
            bitmap = h.a(i1, j1);
        }
        Bitmap bitmap1 = bitmap;
        if (bitmap == null)
        {
            bitmap1 = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        }
        return bitmap1;
    }

    public hhm a(hho hho1)
    {
        gzf gzf1 = (gzf)e.get(hho1);
        if (gzf1 != null)
        {
            return gzf1;
        } else
        {
            return (hhm)g.a(hho1);
        }
    }

    public Object a(gzf gzf1, ByteBuffer bytebuffer)
    {
        for (int i1 = 0; i1 < m.length; i1++)
        {
            Object obj = m[i1].a(gzf1, bytebuffer);
            if (obj != null)
            {
                return obj;
            }
        }

        return null;
    }

    public void a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return;
        }
        if (h != null)
        {
            if (b != null)
            {
                b.a();
            }
            h.a(bitmap);
            return;
        } else
        {
            bitmap.recycle();
            return;
        }
    }

    public void a(gzf gzf1)
    {
        synchronized (f)
        {
            f.add(gzf1);
        }
        return;
        gzf1;
        hashset;
        JVM INSTR monitorexit ;
        throw gzf1;
    }

    public void a(hhm hhm1)
    {
        if (!e.containsKey(hhm1.w()))
        {
            hhm1 = String.valueOf(hhm1.w());
            throw new IllegalStateException((new StringBuilder(String.valueOf(hhm1).length() + 24)).append("Resource is not active: ").append(hhm1).toString());
        }
        gzf gzf1 = (gzf)hhm1;
        switch (gzf1.x())
        {
        case 2: // '\002'
        default:
            hhm1 = String.valueOf(hhm1.y());
            String s1;
            if (hhm1.length() != 0)
            {
                hhm1 = "Illegal resource state: ".concat(hhm1);
            } else
            {
                hhm1 = new String("Illegal resource state: ");
            }
            throw new IllegalStateException(hhm1);

        case 8: // '\b'
            gzf1.t();
            // fall through

        case 1: // '\001'
        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
            return;

        case 0: // '\0'
        case 4: // '\004'
        case 7: // '\007'
            break;
        }
        if (gzf1.A())
        {
            s1 = String.valueOf(gzf1.w());
            (new StringBuilder(String.valueOf(s1).length() + 23)).append("Requesting image load: ").append(s1);
        }
        gzf1.c(2);
        c(hhm1);
    }

    public void a(hhm hhm1, int i1, int j1)
    {
        if (!(hhm1 instanceof gzf) || i1 != 4)
        {
            super.a(hhm1, i1, j1);
            return;
        }
        if (((gzf)hhm1).e())
        {
            if (hhm1.A())
            {
                String s1 = String.valueOf(hhm1.w());
                (new StringBuilder(String.valueOf(s1).length() + 21)).append("Retrying image load: ").append(s1);
            }
            hhm1.c(2);
            c(hhm1);
            return;
        } else
        {
            hhm1.c(5);
            super.a(hhm1, 5, j1);
            return;
        }
    }

    public void a(hhm hhm1, hhp hhp)
    {
        g.v();
        Object obj = hhm1.w();
        hhm hhm2 = (hhm)e.get(obj);
        if (hhm2 != null)
        {
            if (hhm2 != hhm1)
            {
                hhm1 = String.valueOf(obj);
                throw new IllegalStateException((new StringBuilder(String.valueOf(hhm1).length() + 80)).append("Duplicate resource: ").append(hhm1).append(". Check getManagedResource() prior to calling loadResource. ").toString());
            }
            if (hhm1.A())
            {
                obj = String.valueOf(obj);
                (new StringBuilder(String.valueOf(obj).length() + 25)).append("Adding another consumer: ").append(((String) (obj)));
            }
            hhm1.b(hhp);
            return;
        }
        hhm2 = (hhm)g.a(obj);
        if (hhm2 != null)
        {
            if (hhm2 != hhm1)
            {
                hhm1 = String.valueOf(obj);
                throw new IllegalStateException((new StringBuilder(String.valueOf(hhm1).length() + 80)).append("Duplicate resource: ").append(hhm1).append(". Check getManagedResource() prior to calling loadResource. ").toString());
            }
            if (hhm1.A())
            {
                String s1 = String.valueOf(obj);
                (new StringBuilder(String.valueOf(s1).length() + 12)).append("Activating: ").append(s1);
            }
            g.b(obj);
            e.put(obj, hhm1);
            hhm1.b(hhp);
            return;
        }
        e.put(obj, hhm1);
        if (hhm1.A())
        {
            obj = String.valueOf(obj);
            (new StringBuilder(String.valueOf(obj).length() + 14)).append("loadResource: ").append(((String) (obj)));
        }
        hhm1.b(hhp);
    }

    public void a(PrintWriter printwriter)
    {
        Object obj;
        obj = g.g();
        int i1 = c.a;
        int k1 = g.a();
        int l1 = ((Map) (obj)).size();
        int i2 = g.e();
        int j2 = g.c();
        int k2 = g.d();
        int l2 = g.f();
        printwriter.println((new StringBuilder(186)).append("Image cache size: ").append(i1).append("; cached size: ").append(k1).append("; cached bitmaps: ").append(l1).append("; put count: ").append(i2).append("; hit count: ").append(j2).append("; miss count: ").append(k2).append("; eviction count: ").append(l2).toString());
        Iterator iterator1;
        String s1;
        if (((Map) (obj)).isEmpty())
        {
            printwriter.println("Image cache is empty");
        } else
        {
            Iterator iterator2 = ((Map) (obj)).keySet().iterator();
            while (iterator2.hasNext()) 
            {
                Object obj1 = (hho)iterator2.next();
                int j1 = ((gzf)((Map) (obj)).get(obj1)).r();
                obj1 = String.valueOf(obj1);
                printwriter.println((new StringBuilder(String.valueOf(obj1).length() + 27)).append("Cached: ").append(j1).append(" bytes, ").append(((String) (obj1))).toString());
            }
        }
        obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (!f.isEmpty())
        {
            for (iterator1 = f.iterator(); iterator1.hasNext(); printwriter.println((new StringBuilder(String.valueOf(s1).length() + 13)).append("Downloading: ").append(s1).toString()))
            {
                s1 = String.valueOf((gzf)iterator1.next());
            }

        }
        break MISSING_BLOCK_LABEL_377;
        printwriter;
        obj;
        JVM INSTR monitorexit ;
        throw printwriter;
        obj;
        JVM INSTR monitorexit ;
        if (e.isEmpty())
        {
            printwriter.println("No active resources");
        } else
        {
            printwriter.println("Active resources");
            Iterator iterator = e.values().iterator();
            while (iterator.hasNext()) 
            {
                g.a(4, "ImageResourceManager", ((hhm)iterator.next()).toString());
            }
        }
        if (g.u())
        {
            (new gzs(this)).execute(new Void[0]);
            return;
        } else
        {
            b(printwriter);
            return;
        }
    }

    public gyr b()
    {
        return j;
    }

    public void b(gzf gzf1)
    {
        synchronized (f)
        {
            f.remove(gzf1);
        }
        return;
        gzf1;
        hashset;
        JVM INSTR monitorexit ;
        throw gzf1;
    }

    public void b(hhm hhm1)
    {
        hhm1 = (gzf)hhm1;
        gzi gzi1 = (gzi)hhm1.w();
        if (hhm1.A())
        {
            String s1 = String.valueOf(gzi1);
            (new StringBuilder(String.valueOf(s1).length() + 29)).append("Deactivating image resource: ").append(s1);
        }
        if (hhm1.x() == 2)
        {
            hhm1.c(7);
            hhm1.m();
        }
        e.remove(gzi1);
        b(((gzf) (hhm1)));
        if (hhm1.q() && hhm1.r() < d)
        {
            hhm1.s();
            if (i == 0L || i < System.currentTimeMillis())
            {
                i = 0L;
                g.a(gzi1, hhm1);
            }
            return;
        } else
        {
            hhm1.n();
            return;
        }
    }

    void b(PrintWriter printwriter)
    {
        long l1 = j.a();
        long l2 = j.c();
        long l3 = Math.max(0L, l1 - l2);
        String s1 = String.valueOf(hpq.a(l1));
        String s2 = String.valueOf(hpq.a(l2));
        String s3 = String.valueOf(hpq.a(l3));
        printwriter.println((new StringBuilder(String.valueOf(s1).length() + 39 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("Disk cache total size: ").append(s1).append("; used: ").append(s2).append("; free: ").append(s3).toString());
        l1 = k.b();
        l2 = k.c();
        l3 = Math.max(0L, l1 - l2);
        s1 = String.valueOf(hpq.a(l1));
        s2 = String.valueOf(hpq.a(l2));
        s3 = String.valueOf(hpq.a(l3));
        printwriter.println((new StringBuilder(String.valueOf(s1).length() + 44 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("Long-term cache total size: ").append(s1).append("; used: ").append(s2).append("; free: ").append(s3).toString());
    }

    public gyr c()
    {
        return k;
    }

    public int d()
    {
        return p;
    }

    public int e()
    {
        return q;
    }

    public int f()
    {
        return r;
    }

    public long g()
    {
        return c.d;
    }

    public long h()
    {
        return c.e;
    }

    public void i()
    {
        if (!e.isEmpty())
        {
            NetworkInfo networkinfo = ((ConnectivityManager)l().getSystemService("connectivity")).getActiveNetworkInfo();
            boolean flag;
            if (networkinfo != null && networkinfo.isConnected())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                Iterator iterator = e.values().iterator();
                while (iterator.hasNext()) 
                {
                    hhm hhm1 = (hhm)iterator.next();
                    if (hhm1.x() == 4)
                    {
                        a(hhm1, 2);
                        c(hhm1);
                    }
                }
            }
        }
    }

    public float j()
    {
        return o;
    }

    public void k()
    {
        g.a(-1);
        i = System.currentTimeMillis() + 2000L;
        if (h != null)
        {
            h.a();
        }
    }
}
