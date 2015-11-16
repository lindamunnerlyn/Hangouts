// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
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

public final class gvc extends hda
    implements gta, gvb
{

    private gvl b;
    private final gwe c;
    private final int d;
    private final HashMap e;
    private final HashSet f;
    private final he g;
    private final gvr h;
    private long i;
    private final guh j;
    private final guh k;
    private final int l;
    private final gus m[];
    private final hbt n;
    private float o;
    private int p;
    private int q;
    private int r;
    private int s;

    protected gvc(Context context, gwc gwc1)
    {
        super(context);
        e = new HashMap();
        f = new HashSet();
        l = g.M(j());
        gwa gwa1 = gwc1.b();
        j = new guh(context, gwa1.a, gwa1.b, gwa1.c, gwa1.d, gwa1.e);
        gwa1 = gwc1.c();
        k = new guh(context, gwa1.a, gwa1.b, gwa1.c, gwa1.d, gwa1.e);
        c = gwc1.a();
        d = (int)((double)c.a * 0.75D);
        g = new gve(this, c.a);
        gwc1 = g.K(context);
        o = Math.min(240F / ((DisplayMetrics) (gwc1)).xdpi, 1.0F);
        p = Math.max(((DisplayMetrics) (gwc1)).heightPixels, ((DisplayMetrics) (gwc1)).widthPixels);
        if (p == 0)
        {
            p = 640;
        }
        q = (int)((float)p * 0.2F * o);
        r = (int)((float)p * 0.5F);
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L2; else goto _L1
_L1:
        gwc1 = null;
_L4:
        h = gwc1;
        gwc1 = hgx.c(context, gus);
        m = (gus[])gwc1.toArray(new gus[gwc1.size()]);
        Arrays.sort(m, new gvd(this));
        int i1 = context.getApplicationContext().getResources().getInteger(g.sz);
        if (l >= 256)
        {
            i1 = 0x1000000;
        }
        s = i1;
        n = (hbt)hgx.b(context, hbt);
        if (Log.isLoggable("ImageResourceManager", 3))
        {
            gwc1 = new gvg(this, new StringWriter());
            a(gwc1);
            g.a(4, "ImageResourceManager", gwc1.toString());
        }
        context = hgx.b(context);
        context.b(gta, this);
        if (h != null)
        {
            context.b(gta, h);
        }
        return;
_L2:
        gvr gvr1 = new gvr(c.c);
        gwc1 = gvr1;
        if (c.f)
        {
            b = new gvl(c, gvr1, f(), e());
            g.a(new gvf(this));
            gwc1 = gvr1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static gvl a(gvc gvc1)
    {
        return gvc1.b;
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

    public hcv a(hcx hcx1)
    {
        guu guu1 = (guu)e.get(hcx1);
        if (guu1 != null)
        {
            return guu1;
        } else
        {
            return (hcv)g.a(hcx1);
        }
    }

    public Object a(guu guu1, ByteBuffer bytebuffer)
    {
        for (int i1 = 0; i1 < m.length; i1++)
        {
            Object obj = m[i1].a(guu1, bytebuffer);
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

    public void a(guu guu1)
    {
        synchronized (f)
        {
            f.add(guu1);
        }
        return;
        guu1;
        hashset;
        JVM INSTR monitorexit ;
        throw guu1;
    }

    public void a(hcv hcv1)
    {
        if (!e.containsKey(hcv1.v()))
        {
            hcv1 = String.valueOf(hcv1.v());
            throw new IllegalStateException((new StringBuilder(String.valueOf(hcv1).length() + 24)).append("Resource is not active: ").append(hcv1).toString());
        }
        guu guu1 = (guu)hcv1;
        switch (guu1.w())
        {
        case 2: // '\002'
        default:
            hcv1 = String.valueOf(hcv1.x());
            String s1;
            if (hcv1.length() != 0)
            {
                hcv1 = "Illegal resource state: ".concat(hcv1);
            } else
            {
                hcv1 = new String("Illegal resource state: ");
            }
            throw new IllegalStateException(hcv1);

        case 8: // '\b'
            guu1.s();
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
        if (guu1.z())
        {
            s1 = String.valueOf(guu1.v());
            (new StringBuilder(String.valueOf(s1).length() + 23)).append("Requesting image load: ").append(s1);
        }
        guu1.c(2);
        c(hcv1);
    }

    public void a(hcv hcv1, int i1, int j1)
    {
        if (!(hcv1 instanceof guu) || i1 != 4)
        {
            super.a(hcv1, i1, j1);
            return;
        }
        if (((guu)hcv1).e())
        {
            if (hcv1.z())
            {
                String s1 = String.valueOf(hcv1.v());
                (new StringBuilder(String.valueOf(s1).length() + 21)).append("Retrying image load: ").append(s1);
            }
            hcv1.c(2);
            c(hcv1);
            return;
        } else
        {
            hcv1.c(5);
            super.a(hcv1, 5, j1);
            return;
        }
    }

    public void a(hcv hcv1, hcy hcy)
    {
        g.w();
        Object obj = hcv1.v();
        hcv hcv2 = (hcv)e.get(obj);
        if (hcv2 != null)
        {
            if (hcv2 != hcv1)
            {
                hcv1 = String.valueOf(obj);
                throw new IllegalStateException((new StringBuilder(String.valueOf(hcv1).length() + 80)).append("Duplicate resource: ").append(hcv1).append(". Check getManagedResource() prior to calling loadResource. ").toString());
            }
            if (hcv1.z())
            {
                obj = String.valueOf(obj);
                (new StringBuilder(String.valueOf(obj).length() + 25)).append("Adding another consumer: ").append(((String) (obj)));
            }
            hcv1.b(hcy);
            return;
        }
        hcv2 = (hcv)g.a(obj);
        if (hcv2 != null)
        {
            if (hcv2 != hcv1)
            {
                hcv1 = String.valueOf(obj);
                throw new IllegalStateException((new StringBuilder(String.valueOf(hcv1).length() + 80)).append("Duplicate resource: ").append(hcv1).append(". Check getManagedResource() prior to calling loadResource. ").toString());
            }
            if (hcv1.z())
            {
                String s1 = String.valueOf(obj);
                (new StringBuilder(String.valueOf(s1).length() + 12)).append("Activating: ").append(s1);
            }
            g.b(obj);
            e.put(obj, hcv1);
            hcv1.b(hcy);
            return;
        }
        e.put(obj, hcv1);
        if (hcv1.z())
        {
            obj = String.valueOf(obj);
            (new StringBuilder(String.valueOf(obj).length() + 14)).append("loadResource: ").append(((String) (obj)));
        }
        hcv1.b(hcy);
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
                Object obj1 = (hcx)iterator2.next();
                int j1 = ((guu)((Map) (obj)).get(obj1)).q();
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
                s1 = String.valueOf((guu)iterator1.next());
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
                g.a(4, "ImageResourceManager", ((hcv)iterator.next()).toString());
            }
        }
        if (g.v())
        {
            (new gvh(this)).execute(new Void[0]);
            return;
        } else
        {
            b(printwriter);
            return;
        }
    }

    public guh b()
    {
        return j;
    }

    public void b(guu guu1)
    {
        synchronized (f)
        {
            f.remove(guu1);
        }
        return;
        guu1;
        hashset;
        JVM INSTR monitorexit ;
        throw guu1;
    }

    public void b(hcv hcv1)
    {
        hcv1 = (guu)hcv1;
        guy guy1 = (guy)hcv1.v();
        if (hcv1.z())
        {
            String s1 = String.valueOf(guy1);
            (new StringBuilder(String.valueOf(s1).length() + 29)).append("Deactivating image resource: ").append(s1);
        }
        if (hcv1.w() == 2)
        {
            hcv1.c(7);
            hcv1.m();
        }
        e.remove(guy1);
        b(((guu) (hcv1)));
        if (hcv1.p() && hcv1.q() < d)
        {
            hcv1.r();
            if (i == 0L || i < System.currentTimeMillis())
            {
                i = 0L;
                g.a(guy1, hcv1);
            }
            return;
        } else
        {
            hcv1.n();
            return;
        }
    }

    void b(PrintWriter printwriter)
    {
        long l1 = j.a();
        long l2 = j.c();
        long l3 = Math.max(0L, l1 - l2);
        String s1 = String.valueOf(hkv.a(l1));
        String s2 = String.valueOf(hkv.a(l2));
        String s3 = String.valueOf(hkv.a(l3));
        printwriter.println((new StringBuilder(String.valueOf(s1).length() + 39 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("Disk cache total size: ").append(s1).append("; used: ").append(s2).append("; free: ").append(s3).toString());
        l1 = k.b();
        l2 = k.c();
        l3 = Math.max(0L, l1 - l2);
        s1 = String.valueOf(hkv.a(l1));
        s2 = String.valueOf(hkv.a(l2));
        s3 = String.valueOf(hkv.a(l3));
        printwriter.println((new StringBuilder(String.valueOf(s1).length() + 44 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("Long-term cache total size: ").append(s1).append("; used: ").append(s2).append("; free: ").append(s3).toString());
    }

    public guh c()
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

    public float i()
    {
        return o;
    }
}
