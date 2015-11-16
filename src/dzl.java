// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class dzl
    implements dzo, gbj
{

    public static final boolean a = false;
    public final dzn b;
    private int c;
    private final LinkedHashMap d = new LinkedHashMap(0, 0.75F, true);
    private final Object e = new Object();

    public dzl(Context context, int i)
    {
        int j;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.a(flag);
        j = ((ActivityManager)context.getSystemService("activity")).getMemoryClass() << 10 << 10;
        c = (int)((double)j / 10D);
        if (a)
        {
            int l = c;
            ebw.b("BitmapCache", (new StringBuilder(159)).append("Initializing BitmapCache; maxMemory available (bytes): ").append(j).append("; expected cacheSize (bytes): ").append(l).append("; min (bytes): 2097152; max (bytes): 25165824").toString());
        }
        c = Math.max(c, 0x200000);
        c = Math.min(c, 0x1800000);
        if (a)
        {
            int k = c;
            ebw.b("BitmapCache", (new StringBuilder(43)).append("Initialized cache size (bytes): ").append(k).toString());
        }
        b = dzn.a(5, 30, 100, i, "Image");
    }

    private void a(boolean flag)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator;
        c();
        if (a)
        {
            ebw.b("BitmapCache", (new StringBuilder(50)).append("Begin BitmapCache prune: onlyAboveCapacity = ").append(flag).toString());
        }
        iterator = d.entrySet().iterator();
        int i;
        int k;
        i = 0;
        k = 0;
_L12:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1 = (ebh)((java.util.Map.Entry)iterator.next()).getValue();
        int j = k;
        if (((ebh) (obj1)).i() == 0)
        {
            j = k + 1;
        }
        obj1 = ((ebh) (obj1)).f();
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        i = c(((Bitmap) (obj1))) + i;
          goto _L4
_L2:
        if (a)
        {
            j = c;
            ebw.b("BitmapCache", (new StringBuilder(108)).append("Evictable bitmap count: ").append(k).append("; total cache (bytes) = ").append(i).append("; max cache size (bytes) = ").append(j).toString());
        }
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_511;
        }
        k = c;
_L14:
        iterator = d.entrySet().iterator();
        j = 0;
_L13:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        obj1 = (ebh)((java.util.Map.Entry)iterator.next()).getValue();
        if (i <= k) goto _L8; else goto _L7
_L7:
        if (((ebh) (obj1)).i() != 0) goto _L8; else goto _L9
_L9:
        obj1 = ((ebh) (obj1)).c();
        iterator.remove();
        if (obj1 == null) goto _L8; else goto _L10
_L10:
        int l;
        l = c(((Bitmap) (obj1)));
        if (a)
        {
            int k1 = ((Bitmap) (obj1)).getWidth();
            int l1 = ((Bitmap) (obj1)).getHeight();
            int i2 = c;
            ebw.b("BitmapCache", (new StringBuilder(107)).append("Evicting bitmap: size (").append(k1).append("x").append(l1).append("); bytes: ").append(l).append("; need to evict: ").append(i - i2).append(" bytes more.").toString());
        }
        j = l + j;
        b.a(((Bitmap) (obj1)));
        l = i - l;
        i = j;
        j = l;
          goto _L11
_L6:
        if (!a || j <= 0)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        ebw.b("BitmapCache", (new StringBuilder(60)).append("************************* Pruned total of ").append(j).append(" bytes.").toString());
        c();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L8:
        int i1 = i;
        i = j;
        j = i1;
          goto _L11
_L4:
        k = j;
          goto _L12
_L11:
        int j1 = j;
        j = i;
        i = j1;
          goto _L13
        k = 0;
          goto _L14
    }

    private boolean a(int i)
    {
        boolean flag = true;
        if (a)
        {
            ebw.b("BitmapCache", (new StringBuilder(33)).append("BitmapCache evictSome=").append(i).toString());
        }
        c();
        switch (i)
        {
        default:
            flag = false;
            // fall through

        case 0: // '\0'
            return flag;

        case 1: // '\001'
            h();
            return true;

        case 2: // '\002'
            ebw.f("BitmapCache", "Warning: BitmapCache hitting too many OOMs.");
            break;
        }
        gbi.a.a();
        return true;
    }

    private static int c(Bitmap bitmap)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return bitmap.getAllocationByteCount();
        } else
        {
            return bitmap.getByteCount();
        }
    }

    private void c()
    {
        int i;
        i = 0;
        if (!a)
        {
            return;
        }
        Object obj2 = e;
        obj2;
        JVM INSTR monitorenter ;
        Iterator iterator;
        iterator = d.entrySet().iterator();
        ebw.b("BitmapCache", "** BitmapCache stats");
        int j;
        int k;
        j = 0;
        k = 0;
_L4:
        Object obj;
        Object obj1;
        ebh ebh1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_294;
        }
        obj = (java.util.Map.Entry)iterator.next();
        ebh1 = (ebh)((java.util.Map.Entry) (obj)).getValue();
        obj1 = ebh1.f();
        int l;
        int i1;
        int j1;
        l = i;
        i1 = j;
        j1 = k;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_383;
        }
        int k1;
        int l1;
        k1 = ((Bitmap) (obj1)).getWidth();
        l1 = ((Bitmap) (obj1)).getHeight();
        j1 = k + k1 * l1;
        i1 = j + 1;
        l = i + ((Bitmap) (obj1)).getByteCount();
        obj1 = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = obj1;
        if (((String) (obj1)).startsWith("//"))
        {
            obj = String.valueOf(obj1);
            if (((String) (obj)).length() == 0)
            {
                break MISSING_BLOCK_LABEL_272;
            }
            obj = "https:".concat(((String) (obj)));
        }
_L2:
        i = ebh1.i();
        ebw.b("BitmapCache", (new StringBuilder(String.valueOf(obj).length() + 73)).append("*** Bitmap (refcount = ").append(i).append(") ;   size: ").append(k1).append(" x ").append(l1).append(": ").append(((String) (obj))).toString());
        break MISSING_BLOCK_LABEL_383;
        obj = new String("https:");
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj2;
        JVM INSTR monitorexit ;
        throw exception;
        double d1;
        double d2;
        d1 = (double)i / 1024D;
        d2 = d1 / 1024D;
        ebw.b("BitmapCache", (new StringBuilder(168)).append("*****   Total Pixel Area : ").append(k).append(" sq pixels; numBitmaps = ").append(j).append("; totalBytes = ").append(i).append("; in KB = ").append(d1).append("; in MB = ").append(d2).toString());
        obj2;
        JVM INSTR monitorexit ;
        return;
        j = i1;
        k = j1;
        i = l;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Bitmap a(int i, int j)
    {
        Object obj2 = e;
        obj2;
        JVM INSTR monitorenter ;
        if (a)
        {
            int k = d.size();
            ebw.b("BitmapCache", (new StringBuilder(100)).append("BitmapCache getBitmap starting evictions cache size=").append(k).append(" width=").append(i).append(" height=").append(j).toString());
        }
        int l = 0;
        Object obj = d.entrySet().iterator();
_L1:
        Object obj1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_137;
            }
            obj1 = ((ebh)((java.util.Map.Entry)((Iterator) (obj)).next()).getValue()).f();
        } while (obj1 == null);
        l = c(((Bitmap) (obj1))) + l;
          goto _L1
        if (l > c)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        if (a)
        {
            i = c;
            ebw.b("BitmapCache", (new StringBuilder(114)).append("BitmapCache getAvailableBitmap: currentCacheSize ").append(l).append(" < ").append(i).append(" available. So not evicting any bitmaps.").toString());
        }
        obj2;
        JVM INSTR monitorexit ;
        return null;
        Iterator iterator = d.entrySet().iterator();
        obj = null;
_L4:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_357;
            }
            obj1 = (ebh)((java.util.Map.Entry)iterator.next()).getValue();
        } while (((ebh) (obj1)).i() != 0 || !((ebh) (obj1)).a(i, j) || !((ebh) (obj1)).g());
        if (!a) goto _L3; else goto _L2
_L2:
        obj = String.valueOf(((ebh) (obj1)).toString());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        obj = "BitmapCache getAvailableBitmap evicting: ".concat(((String) (obj)));
_L6:
        ebw.b("BitmapCache", ((String) (obj)));
_L3:
        obj = ((ebh) (obj1)).c();
        iterator.remove();
        obj1 = obj;
        if (obj != null) goto _L5; else goto _L4
_L5:
        break MISSING_BLOCK_LABEL_360;
        obj = new String("BitmapCache getAvailableBitmap evicting: ");
          goto _L6
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        obj1 = obj;
        if (a)
        {
            int i1 = d.size();
            ebw.b("BitmapCache", (new StringBuilder(112)).append("BitmapCache returnOneBitmapToPool finished evictions cache size=").append(i1).append(" width=").append(i).append(" height=").append(j).toString());
        }
        obj2;
        JVM INSTR monitorexit ;
        c();
        return ((Bitmap) (obj1));
    }

    public Bitmap a(byte abyte0[], int i, int j, int k)
    {
        try
        {
            abyte0 = b(abyte0, i, j, k);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    public ebh a(String s)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        c();
        s = (ebh)d.get(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        a(true);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return s;
        s.a();
          goto _L1
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public ebh a(String s, ebh ebh1)
    {
        boolean flag1 = true;
        n.b(ebh1);
        if (a)
        {
            boolean flag;
            if (!b(ebh1.e()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            n.b(flag);
            if (!b.b(ebh1.e()))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            n.b(flag);
        }
        synchronized (e)
        {
            s = (ebh)d.put(s, ebh1);
            c();
        }
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    LinkedHashMap a()
    {
        return d;
    }

    public void a(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            c();
            b.a(bitmap);
        }
    }

    public Bitmap b(int i, int j)
    {
        c();
        return b.a(i, j, this);
    }

    public Bitmap b(byte abyte0[], int i, int j, int k)
    {
        Object obj;
        Object obj1;
        int l;
        int i1;
        int j1;
        int k1;
        boolean flag;
        boolean flag1;
        if (i >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        n.a(flag1);
        if (j >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        n.a(flag1);
        if (k % 90 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        n.a(flag1);
        OutOfMemoryError outofmemoryerror;
        OutOfMemoryError outofmemoryerror1;
        if (k % 180 != 0)
        {
            i1 = j;
            l = i;
        } else
        {
            l = j;
            i1 = i;
        }
        obj1 = dzn.a(false, 0, 0);
        obj1.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, ((android.graphics.BitmapFactory.Options) (obj1)));
        obj1.inJustDecodeBounds = false;
        j1 = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
        k1 = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
        if (a)
        {
            obj = String.valueOf("BitmapCache.decodeByteArray: bitmap.w=");
            ebw.b("BitmapCache", (new StringBuilder(String.valueOf(obj).length() + 73)).append(((String) (obj))).append(j1).append(" bitmap.h=").append(k1).append(", limit.w=").append(i1).append(" limit.h=").append(l).toString());
        }
        if (j1 > i1) goto _L2; else goto _L1
_L1:
        i = j1;
        j = k1;
        if (k1 <= l) goto _L3; else goto _L2
        abyte0;
        ebw.e("Babel", "can not decode bitmap dimensions", abyte0);
        obj1 = null;
_L5:
        return ((Bitmap) (obj1));
_L2:
        flag = true;
        j = k1;
        i = j1;
        for (j1 = ((flag) ? 1 : 0); i > i1 || j > l; j1 <<= 1)
        {
            i /= 2;
            j /= 2;
        }

        if (a)
        {
            ebw.b("BitmapCache", (new StringBuilder(52)).append("BitmapCache.decodeByteArray: sample size=").append(j1).toString());
        }
        obj1.inSampleSize = j1;
_L3:
        if (a)
        {
            ebw.b("BitmapCache", (new StringBuilder(66)).append("BitmapCache.decodeByteArray: decode to w=").append(i).append(" h=").append(j).toString());
        }
        l = 0;
_L7:
        obj = b.a(abyte0, ((android.graphics.BitmapFactory.Options) (obj1)), i, j, this);
        obj1 = obj;
        if (obj == null) goto _L5; else goto _L4
_L4:
        obj1 = obj;
        if (k % 360 == 0) goto _L5; else goto _L6
_L6:
        i = 0;
_L9:
        j = ((Bitmap) (obj)).getWidth();
        l = ((Bitmap) (obj)).getHeight();
        obj1 = new Matrix();
        ((Matrix) (obj1)).setRotate(k, (float)j / 2.0F, (float)l / 2.0F);
        obj1 = Bitmap.createBitmap(((Bitmap) (obj)), 0, 0, j, l, ((Matrix) (obj1)), true);
        if (obj1 == null || obj == obj1)
        {
            break MISSING_BLOCK_LABEL_477;
        }
        a(((Bitmap) (obj)));
        return ((Bitmap) (obj1));
        outofmemoryerror;
        i1 = abyte0.length;
        ebw.f("Babel", (new StringBuilder(53)).append("out of memory for decoding a ").append(i1).append(" sized bitmap").toString());
        l++;
        if (!a(l))
        {
            i = abyte0.length;
            ebw.f("Babel", (new StringBuilder(61)).append("out of memory: gave up on decoding a ").append(i).append(" sized bitmap").toString());
            throw outofmemoryerror;
        }
          goto _L7
        outofmemoryerror1;
        j = abyte0.length;
        ebw.f("Babel", (new StringBuilder(53)).append("out of memory for rotating a ").append(j).append(" sized bitmap").toString());
        i++;
        if (a(i)) goto _L9; else goto _L8
_L8:
        i = abyte0.length;
        ebw.f("Babel", (new StringBuilder(61)).append("out of memory: gave up on rotating a ").append(i).append(" sized bitmap").toString());
        throw outofmemoryerror1;
          goto _L7
    }

    dzn b()
    {
        return b;
    }

    public void b(int i)
    {
    }

    boolean b(Bitmap bitmap)
    {
label0:
        {
            synchronized (e)
            {
                Iterator iterator = d.values().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (((ebh)iterator.next()).f() != bitmap);
            }
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        bitmap;
        obj;
        JVM INSTR monitorexit ;
        throw bitmap;
    }

    public boolean b(String s)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = (ebh)d.get(s);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        if (((ebh) (obj1)).i() <= 0)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (a)
        {
            int i = ((ebh) (obj1)).i();
            ebw.b("BitmapCache", (new StringBuilder(String.valueOf(s).length() + 55)).append("refcount is ").append(i).append(", not removing ").append(s).append("from bitmap cache").toString());
        }
        c();
        obj;
        JVM INSTR monitorexit ;
        return false;
        obj1 = ((ebh) (obj1)).c();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        b.a(((Bitmap) (obj1)));
        d.remove(s);
        c();
        obj;
        JVM INSTR monitorexit ;
        return true;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void h()
    {
        if (a)
        {
            ebw.b("BitmapCache", "BitmapCache trimMemory.");
        }
        a(false);
    }

    static 
    {
        hik hik = ebw.u;
    }
}
