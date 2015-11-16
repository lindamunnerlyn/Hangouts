// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.SparseArray;

public final class dzp extends dzn
{

    private static volatile int e = 0;
    private final SparseArray f = new SparseArray();
    private final Object g = new Object();
    private final int h;
    private int i;
    private int j;
    private boolean k;
    private final int l;
    private final int m;
    private int n;

    protected dzp(int i1, int j1, int k1, int l1, String s)
    {
        boolean flag = false;
        super(s);
        k = false;
        n = 0;
        h = i1;
        if (l1 >= 0)
        {
            flag = true;
        }
        gbh.a(flag);
        l = l1;
        m = b(l1, l1);
        if (l1 != 0)
        {
            k = true;
            i = j1;
            j = k1;
        }
    }

    private static String a(int i1)
    {
        return (new StringBuilder(23)).append(i1 >>> 16).append("x").append(0xffff & i1).toString();
    }

    private void a(android.graphics.BitmapFactory.Options options, int i1, int j1, dzo dzo1)
    {
        if (options.inJustDecodeBounds)
        {
            return;
        } else
        {
            options.inBitmap = b(i1, j1, dzo1);
            return;
        }
    }

    private static int b(int i1, int j1)
    {
        if (i1 > 65535 || j1 > 65535)
        {
            return 0;
        } else
        {
            return i1 << 16 | j1;
        }
    }

    private Bitmap b(int i1, int j1, dzo dzo1)
    {
        int k1;
        int i2;
        k1 = 0;
        i2 = b(i1, j1);
        if (i2 == 0) goto _L2; else goto _L1
_L1:
        Object obj1 = g;
        obj1;
        JVM INSTR monitorenter ;
        if (!k)
        {
            break MISSING_BLOCK_LABEL_85;
        }
_L3:
        if (k1 >= i)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        Bitmap bitmap = super.a(l, l, null);
        n = n + 1;
        a(bitmap);
        k1++;
          goto _L3
        k = false;
        dzq dzq1 = (dzq)f.get(i2);
        if (dzq1 == null) goto _L5; else goto _L4
_L4:
        if (dzq1.a <= 0) goto _L5; else goto _L6
_L6:
        Object obj;
        if (b)
        {
            String s = c;
            String s2 = a(i2);
            int l1 = dzq1.a;
            String s3 = String.valueOf(dzq1.b[dzq1.a - 1]);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 81 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("BitmapPoolICS(").append(s).append(") found bitmap from pool for size=").append(s2).append(" numAvailable=").append(l1).append(" Bitmap=").append(s3).toString());
        }
        dzq1.a = dzq1.a - 1;
        obj = dzq1.b[dzq1.a];
        dzq1.b[dzq1.a] = null;
_L8:
        obj1;
        JVM INSTR monitorexit ;
        obj1 = obj;
_L7:
        obj = obj1;
        if (obj1 == null)
        {
            obj = obj1;
            if (i2 == m)
            {
                obj = (ActivityManager)g.nS.getSystemService("activity");
                obj1 = new android.app.ActivityManager.MemoryInfo();
                ((ActivityManager) (obj)).getMemoryInfo(((android.app.ActivityManager.MemoryInfo) (obj1)));
                String s1;
                if (((android.app.ActivityManager.MemoryInfo) (obj1)).lowMemory || n >= j)
                {
                    obj = null;
                } else
                {
                    obj = super.a(l, l, null);
                    n = n + 1;
                }
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = obj;
            if (dzo1 != null)
            {
                dzo1 = dzo1.a(i1, j1);
                obj1 = dzo1;
                if (b)
                {
                    if (dzo1 != null)
                    {
                        obj = c;
                        obj1 = a(i2);
                        ebw.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 53 + String.valueOf(obj1).length())).append("BitmapPoolICS(").append(((String) (obj))).append(") found bitmap from provider for size: ").append(((String) (obj1))).toString());
                        obj1 = dzo1;
                    } else
                    {
                        obj = c;
                        obj1 = a(i2);
                        ebw.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 49 + String.valueOf(obj1).length())).append("BitmapPoolICS(").append(((String) (obj))).append(") no bitmaps in provider for size: ").append(((String) (obj1))).toString());
                        obj1 = dzo1;
                    }
                }
            }
        }
        if (b)
        {
            obj = c;
            s1 = a(i2);
            if (obj1 == null)
            {
                dzo1 = "To Be Allocated";
            } else
            {
                dzo1 = obj1.toString();
            }
            ebw.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 46 + String.valueOf(s1).length() + String.valueOf(dzo1).length())).append("BitmapPoolICS(").append(((String) (obj))).append(") final findPoolBitmap: ").append(s1).append(" bitmap=").append(dzo1).toString());
        }
        return ((Bitmap) (obj1));
_L5:
        if (b)
        {
            obj = c;
            s1 = a(i2);
            ebw.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 45 + String.valueOf(s1).length())).append("BitmapPoolICS(").append(((String) (obj))).append(") no bitmaps in pool for size: ").append(s1).toString());
        }
        break MISSING_BLOCK_LABEL_835;
        dzo1;
        obj1;
        JVM INSTR monitorexit ;
        throw dzo1;
_L2:
        if (b)
        {
            obj = c;
            ebw.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 57)).append("BitmapPoolICS(").append(((String) (obj))).append(") unsupported size: ").append(i1).append("x").append(j1).toString());
        }
        obj1 = null;
          goto _L7
        obj = null;
          goto _L8
    }

    static android.graphics.BitmapFactory.Options b(boolean flag, int i1, int j1)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inScaled = flag;
        options.inDensity = i1;
        options.inTargetDensity = j1;
        options.inSampleSize = 1;
        options.inJustDecodeBounds = false;
        options.inMutable = true;
        return options;
    }

    public Bitmap a(int i1, int j1, dzo dzo1)
    {
        dzo1 = b(i1, j1, dzo1);
        if (dzo1 == null)
        {
            if (b(i1, j1) == m)
            {
                n = n + 1;
            }
            return super.a(i1, j1, null);
        } else
        {
            dzo1.eraseColor(0);
            dzo1.setHasAlpha(true);
            return dzo1;
        }
    }

    public Bitmap a(int i1, android.graphics.BitmapFactory.Options options, int j1, int k1)
    {
        String s;
        s = null;
        gbh.b(options);
        a(options, j1, k1, ((dzo) (null)));
        Bitmap bitmap = BitmapFactory.decodeResource(a, i1, options);
        options = bitmap;
_L1:
        if (b)
        {
            Object obj = c;
            IllegalArgumentException illegalargumentexception;
            if (options != null)
            {
                s = options.toString();
            }
            s = String.valueOf(s);
            ebw.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 80 + String.valueOf(s).length())).append("BitmapPoolICS(").append(((String) (obj))).append(") decodeSampledBitmapFromResource ICS for ").append(i1).append(" bytes gave: ").append(s).toString());
        }
        return options;
        illegalargumentexception;
        if (options.inBitmap == null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        options.inBitmap = null;
        illegalargumentexception = BitmapFactory.decodeResource(a, i1, options);
        j1 = e + 1;
        e = j1;
        options = illegalargumentexception;
        if (j1 % 100 == 0)
        {
            j1 = e;
            ebw.f("Babel", (new StringBuilder(63)).append("Pooled bitmap consistently not being reused count = ").append(j1).toString());
            options = illegalargumentexception;
        }
          goto _L1
        options;
        ebw.f("Babel", (new StringBuilder(33)).append("Oom decoding resource ").append(i1).toString());
        gbi.a.a();
        options = null;
          goto _L1
    }

    public Bitmap a(byte abyte0[], android.graphics.BitmapFactory.Options options, int i1, int j1, dzo dzo1)
    {
        Object obj;
        obj = null;
        gbh.b(options);
        a(options, i1, j1, dzo1);
        dzo1 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        options = dzo1;
_L2:
        if (b)
        {
            dzo1 = c;
            i1 = abyte0.length;
            if (options == null)
            {
                abyte0 = obj;
            } else
            {
                abyte0 = options.toString();
            }
            abyte0 = String.valueOf(abyte0);
            ebw.b("Babel", (new StringBuilder(String.valueOf(dzo1).length() + 64 + String.valueOf(abyte0).length())).append("BitmapPoolICS(").append(dzo1).append(") decodeByteArray ICS for ").append(i1).append(" bytes gave: ").append(abyte0).toString());
        }
        return options;
        dzo1;
        if (b)
        {
            dzo1 = c;
            ebw.b("Babel", (new StringBuilder(String.valueOf(dzo1).length() + 41)).append("BitmapPoolICS(").append(dzo1).append(") Unable to use pool bitmap").toString());
        }
        if (options.inBitmap != null)
        {
            options.inBitmap = null;
            dzo1 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
            i1 = e + 1;
            e = i1;
            options = dzo1;
            if (i1 % 100 == 0)
            {
                i1 = e;
                ebw.f("Babel", (new StringBuilder(63)).append("Pooled bitmap consistently not being reused count = ").append(i1).toString());
                options = dzo1;
            }
        } else
        {
            options = null;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        int i1 = 0;
_L4:
        dzq dzq1;
        if (i1 >= f.size())
        {
            break; /* Loop/switch isn't completed */
        }
        dzq1 = (dzq)f.valueAt(i1);
        int j1 = 0;
_L2:
        if (j1 >= dzq1.a)
        {
            break; /* Loop/switch isn't completed */
        }
        c(dzq1.b[j1]);
        dzq1.b[j1] = null;
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        dzq1.a = 0;
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        f.clear();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Bitmap bitmap)
    {
        int k1;
        gbh.b(anv.a(bitmap));
        if (b)
        {
            gbh.b(b(bitmap));
            gbh.b(ean.a().b(bitmap));
        }
        if (b)
        {
            String s1 = c;
            String s;
            if (bitmap == null)
            {
                s = null;
            } else
            {
                s = bitmap.toString();
            }
            s = String.valueOf(s);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 29 + String.valueOf(s).length())).append("BitmapPoolICS(").append(s1).append(") put bitmap b=").append(s).toString());
        }
        if (bitmap == null)
        {
            bitmap = c;
            ebw.d("Babel", (new StringBuilder(String.valueOf(bitmap).length() + 37)).append("BitmapPoolICS(").append(bitmap).append(") receiving null bitmap").toString(), new Exception());
            return;
        }
        k1 = b(bitmap.getWidth(), bitmap.getHeight());
        if (k1 == 0 || !bitmap.isMutable())
        {
            c(bitmap);
            return;
        }
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        dzq dzq2 = (dzq)f.get(k1);
        dzq dzq1 = dzq2;
        if (dzq2 != null) goto _L2; else goto _L1
_L1:
        if (k1 != m) goto _L4; else goto _L3
_L3:
        int i1 = i;
_L5:
        dzq1 = new dzq(i1);
        f.append(k1, dzq1);
_L2:
        if (dzq1.a >= dzq1.b.length)
        {
            break MISSING_BLOCK_LABEL_407;
        }
        dzq1.b[dzq1.a] = bitmap;
        dzq1.a = dzq1.a + 1;
        if (b)
        {
            bitmap = c;
            String s2 = a(k1);
            i1 = dzq1.a;
            ebw.b("Babel", (new StringBuilder(String.valueOf(bitmap).length() + 79 + String.valueOf(s2).length())).append("BitmapPoolICS(").append(bitmap).append(") putting bitmap into size pool ").append(s2).append(" which now has ").append(i1).append(" items.").toString());
        }
_L6:
        obj;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        obj;
        JVM INSTR monitorexit ;
        throw bitmap;
_L4:
        i1 = h;
          goto _L5
        if (b)
        {
            String s3 = c;
            String s4 = a(k1);
            int j1 = dzq1.a;
            ebw.b("Babel", (new StringBuilder(String.valueOf(s3).length() + 92 + String.valueOf(s4).length())).append("BitmapPoolICS(").append(s3).append(") tried putting bitmap into size pool ").append(s4).append(" but it was full with ").append(j1).append(" items.").toString());
        }
        if (k1 == m)
        {
            n = n - 1;
        }
        c(bitmap);
          goto _L6
    }

    public boolean a(int i1, int j1)
    {
        int k1;
        k1 = b(i1, j1);
        if (k1 == 0)
        {
            return super.a(i1, j1);
        }
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        dzq dzq1 = (dzq)f.get(k1);
        if (dzq1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (dzq1.a == dzq1.b.length)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_70;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    SparseArray b()
    {
        return f;
    }

    boolean b(Bitmap bitmap)
    {
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = b(bitmap.getWidth(), bitmap.getHeight());
        dzq dzq1 = (dzq)f.get(i1);
        if (dzq1 != null)
        {
            int j1 = 0;
            while (j1 < dzq1.a) 
            {
                if (dzq1.b[j1] == bitmap)
                {
                    return true;
                }
                j1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

}
