// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.util.Log;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public final class gvr
    implements gta
{

    private static final int b = (int)Math.round(Math.sqrt(16D));
    private static final hik c = new hik("debug.social.bitmap_pool");
    private static final String d[] = {
        "put", "evict", "hit", "inexact hit", "miss"
    };
    private final gvn e;
    private final gvu f = new gvu();
    private final gvy g = new gvy();
    private final int h;
    private int i;
    private final Map j = new HashMap();

    public gvr(int k)
    {
        h = k;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            e = new gvw();
            return;
        } else
        {
            e = new gvs();
            return;
        }
    }

    private Bitmap a(int k, int l, gvq gvq1)
    {
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap;
        gvo gvo1;
        gvo1 = e.a(k, l);
        bitmap = f.a(gvo1);
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        gvo gvo2;
        Object obj = e.a(b * k, b * l);
        obj = g.a(gvo1, ((gvo) (obj)));
        gvo2 = e.a(gvo1, ((java.util.SortedSet) (obj)), gvq1);
        Object obj1;
        obj1 = gvo2;
        if (gvo2 == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        bitmap = f.a(gvo2);
        obj1 = gvo2;
_L8:
        if (bitmap == null) goto _L4; else goto _L3
_L3:
        e.a(gvo1, bitmap);
        i = (int)((long)i - ((gvo) (obj1)).c);
        g.b(((gvo) (obj1)));
        if (Log.isLoggable("BitmapPoolLru", 2))
        {
            gvq1 = String.valueOf(obj1);
            obj1 = String.valueOf(gvo1);
            (new StringBuilder(String.valueOf(gvq1).length() + 18 + String.valueOf(obj1).length())).append("Got bitmap: ").append(gvq1).append(" for: ").append(((String) (obj1)));
        }
_L6:
        this;
        JVM INSTR monitorexit ;
        return bitmap;
_L4:
        if (!Log.isLoggable("BitmapPoolLru", 3)) goto _L6; else goto _L5
_L5:
        obj1 = String.valueOf(gvo1);
        gvq1 = String.valueOf(gvq1);
        (new StringBuilder(String.valueOf(obj1).length() + 29 + String.valueOf(gvq1).length())).append("Missing bitmap: ").append(((String) (obj1))).append(" match type: ").append(gvq1);
          goto _L6
        gvq1;
        throw gvq1;
_L2:
        obj1 = gvo1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(int k)
    {
        Object obj;
        gvo gvo1;
        if (k < 0)
        {
            throw new IllegalArgumentException(String.format("Target byte size must be >= 0, got: %s", new Object[] {
                Integer.valueOf(k)
            }));
        }
_L3:
        if (i > k)
        {
            obj = f.a();
            gvo1 = e.a(((Bitmap) (obj)));
            g.b(gvo1);
            i = (int)((long)i - gvo1.c);
            if (obj == null)
            {
                throw new IllegalStateException("Pool is larger than its max size, but has no more bitmaps to evict.");
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        ((Bitmap) (obj)).recycle();
        if (Log.isLoggable("BitmapPoolLru", 2))
        {
            obj = String.valueOf(gvo1);
            (new StringBuilder(String.valueOf(obj).length() + 16)).append("Evicted bitmap: ").append(((String) (obj)));
        }
        if (true) goto _L3; else goto _L1
_L1:
    }

    public float a()
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        int k;
        f1 = i;
        k = h;
        f1 /= k;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public Bitmap a(int k, int l)
    {
        return a(k, l, gvq.a);
    }

    public void a(Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        gvo gvo1 = e.a(bitmap);
        if (gvo1.c <= (long)h && bitmap.getConfig() == android.graphics.Bitmap.Config.ARGB_8888 && bitmap.isMutable()) goto _L2; else goto _L1
_L1:
        bitmap.recycle();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f.a(gvo1, bitmap);
        g.a(gvo1);
        if (Log.isLoggable("BitmapPoolLru", 2))
        {
            bitmap = String.valueOf(gvo1);
            (new StringBuilder(String.valueOf(bitmap).length() + 24)).append("Putting bitmap in pool: ").append(bitmap);
        }
        long l = i;
        i = (int)(gvo1.c + l);
        a(h);
        if (true) goto _L4; else goto _L3
_L3:
        bitmap;
        throw bitmap;
    }

    public void a(PrintWriter printwriter)
    {
        this;
        JVM INSTR monitorenter ;
        printwriter.print("current size: ");
        printwriter.println(i);
        printwriter.println("Profiling is currently inactive; to activate set the property debug.social.bitmap_pool to true.");
        this;
        JVM INSTR monitorexit ;
        return;
        printwriter;
        throw printwriter;
    }

}
