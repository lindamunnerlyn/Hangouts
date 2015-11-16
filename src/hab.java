// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.util.Log;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public final class hab
    implements gxm
{

    private static final int b = (int)Math.round(Math.sqrt(16D));
    private static final hnc c = new hnc("debug.social.bitmap_pool");
    private static final String d[] = {
        "put", "evict", "hit", "inexact hit", "miss"
    };
    private final gzx e;
    private final hae f = new hae();
    private final hai g = new hai();
    private final int h;
    private int i;
    private final Map j = new HashMap();

    public hab(int k)
    {
        h = k;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            e = new hag();
            return;
        } else
        {
            e = new hac();
            return;
        }
    }

    private Bitmap a(int k, int l, haa haa1)
    {
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap;
        gzy gzy1;
        gzy1 = e.a(k, l);
        bitmap = f.a(gzy1);
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        gzy gzy2;
        Object obj = e.a(b * k, b * l);
        obj = g.a(gzy1, ((gzy) (obj)));
        gzy2 = e.a(gzy1, ((java.util.SortedSet) (obj)), haa1);
        Object obj1;
        obj1 = gzy2;
        if (gzy2 == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        bitmap = f.a(gzy2);
        obj1 = gzy2;
_L8:
        if (bitmap == null) goto _L4; else goto _L3
_L3:
        e.a(gzy1, bitmap);
        i = (int)((long)i - ((gzy) (obj1)).c);
        g.b(((gzy) (obj1)));
        if (Log.isLoggable("BitmapPoolLru", 2))
        {
            haa1 = String.valueOf(obj1);
            obj1 = String.valueOf(gzy1);
            (new StringBuilder(String.valueOf(haa1).length() + 18 + String.valueOf(obj1).length())).append("Got bitmap: ").append(haa1).append(" for: ").append(((String) (obj1)));
        }
_L6:
        this;
        JVM INSTR monitorexit ;
        return bitmap;
_L4:
        if (!Log.isLoggable("BitmapPoolLru", 3)) goto _L6; else goto _L5
_L5:
        obj1 = String.valueOf(gzy1);
        haa1 = String.valueOf(haa1);
        (new StringBuilder(String.valueOf(obj1).length() + 29 + String.valueOf(haa1).length())).append("Missing bitmap: ").append(((String) (obj1))).append(" match type: ").append(haa1);
          goto _L6
        haa1;
        throw haa1;
_L2:
        obj1 = gzy1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(int k)
    {
        Object obj;
        gzy gzy1;
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
            gzy1 = e.a(((Bitmap) (obj)));
            g.b(gzy1);
            i = (int)((long)i - gzy1.c);
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
            obj = String.valueOf(gzy1);
            (new StringBuilder(String.valueOf(obj).length() + 16)).append("Evicted bitmap: ").append(((String) (obj)));
        }
        if (true) goto _L3; else goto _L1
_L1:
    }

    public Bitmap a(int k, int l)
    {
        return a(k, l, haa.a);
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        a(0);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        gzy gzy1 = e.a(bitmap);
        if (gzy1.c <= (long)h && bitmap.getConfig() == android.graphics.Bitmap.Config.ARGB_8888 && bitmap.isMutable()) goto _L2; else goto _L1
_L1:
        bitmap.recycle();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f.a(gzy1, bitmap);
        g.a(gzy1);
        if (Log.isLoggable("BitmapPoolLru", 2))
        {
            bitmap = String.valueOf(gzy1);
            (new StringBuilder(String.valueOf(bitmap).length() + 24)).append("Putting bitmap in pool: ").append(bitmap);
        }
        long l = i;
        i = (int)(gzy1.c + l);
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

    public float b()
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

}
