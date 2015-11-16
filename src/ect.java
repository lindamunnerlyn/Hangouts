// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.SparseArray;

public final class ect extends ecr
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

    protected ect(int i1, int j1, int k1, int l1, String s)
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
        gdv.a("Expected condition to be true", flag);
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

    private void a(android.graphics.BitmapFactory.Options options, int i1, int j1, ecs ecs1)
    {
        if (options.inJustDecodeBounds)
        {
            return;
        } else
        {
            options.inBitmap = b(i1, j1, ecs1);
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

    private Bitmap b(int i1, int j1, ecs ecs1)
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
        ecu ecu1 = (ecu)f.get(i2);
        if (ecu1 == null) goto _L5; else goto _L4
_L4:
        if (ecu1.a <= 0) goto _L5; else goto _L6
_L6:
        Object obj;
        if (b)
        {
            String s = c;
            String s2 = String.valueOf(a(i2));
            int l1 = ecu1.a;
            String s3 = String.valueOf(ecu1.b[ecu1.a - 1]);
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 81 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("BitmapPoolICS(").append(s).append(") found bitmap from pool for size=").append(s2).append(" numAvailable=").append(l1).append(" Bitmap=").append(s3).toString());
        }
        ecu1.a = ecu1.a - 1;
        obj = ecu1.b[ecu1.a];
        ecu1.b[ecu1.a] = null;
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
                obj = (ActivityManager)g.nU.getSystemService("activity");
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
            if (ecs1 != null)
            {
                ecs1 = ecs1.a(i1, j1);
                obj1 = ecs1;
                if (b)
                {
                    if (ecs1 != null)
                    {
                        obj = c;
                        obj1 = String.valueOf(a(i2));
                        eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 53 + String.valueOf(obj1).length())).append("BitmapPoolICS(").append(((String) (obj))).append(") found bitmap from provider for size: ").append(((String) (obj1))).toString());
                        obj1 = ecs1;
                    } else
                    {
                        obj = c;
                        obj1 = String.valueOf(a(i2));
                        eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 49 + String.valueOf(obj1).length())).append("BitmapPoolICS(").append(((String) (obj))).append(") no bitmaps in provider for size: ").append(((String) (obj1))).toString());
                        obj1 = ecs1;
                    }
                }
            }
        }
        if (b)
        {
            obj = c;
            s1 = String.valueOf(a(i2));
            if (obj1 == null)
            {
                ecs1 = "To Be Allocated";
            } else
            {
                ecs1 = obj1.toString();
            }
            eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 46 + String.valueOf(s1).length() + String.valueOf(ecs1).length())).append("BitmapPoolICS(").append(((String) (obj))).append(") final findPoolBitmap: ").append(s1).append(" bitmap=").append(ecs1).toString());
        }
        return ((Bitmap) (obj1));
_L5:
        if (b)
        {
            obj = c;
            s1 = String.valueOf(a(i2));
            eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 45 + String.valueOf(s1).length())).append("BitmapPoolICS(").append(((String) (obj))).append(") no bitmaps in pool for size: ").append(s1).toString());
        }
        break MISSING_BLOCK_LABEL_850;
        ecs1;
        obj1;
        JVM INSTR monitorexit ;
        throw ecs1;
_L2:
        if (b)
        {
            obj = c;
            eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 57)).append("BitmapPoolICS(").append(((String) (obj))).append(") unsupported size: ").append(i1).append("x").append(j1).toString());
        }
        obj1 = null;
          goto _L7
        obj = null;
          goto _L8
    }

    public Bitmap a(int i1, int j1, ecs ecs1)
    {
        ecs1 = b(i1, j1, ecs1);
        if (ecs1 == null)
        {
            if (b(i1, j1) == m)
            {
                n = n + 1;
            }
            return super.a(i1, j1, null);
        } else
        {
            ecs1.eraseColor(0);
            ecs1.setHasAlpha(true);
            return ecs1;
        }
    }

    public Bitmap a(int i1, android.graphics.BitmapFactory.Options options, int j1, int k1)
    {
        String s;
        s = null;
        gdv.b("Expected non-null", options);
        a(options, j1, k1, ((ecs) (null)));
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
            eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 80 + String.valueOf(s).length())).append("BitmapPoolICS(").append(((String) (obj))).append(") decodeSampledBitmapFromResource ICS for ").append(i1).append(" bytes gave: ").append(s).toString());
        }
        return options;
        illegalargumentexception;
        if (options.inBitmap == null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        options.inBitmap = null;
        illegalargumentexception = BitmapFactory.decodeResource(a, i1, options);
        j1 = e + 1;
        e = j1;
        options = illegalargumentexception;
        if (j1 % 100 == 0)
        {
            j1 = e;
            eev.f("Babel", (new StringBuilder(63)).append("Pooled bitmap consistently not being reused count = ").append(j1).toString());
            options = illegalargumentexception;
        }
          goto _L1
        options;
        eev.f("Babel", (new StringBuilder(33)).append("Oom decoding resource ").append(i1).toString());
        gdw.a.a();
        options = null;
          goto _L1
    }

    public Bitmap a(byte abyte0[], android.graphics.BitmapFactory.Options options, int i1, int j1, ecs ecs1)
    {
        Object obj;
        obj = null;
        gdv.b("Expected non-null", options);
        a(options, i1, j1, ecs1);
        ecs1 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        options = ecs1;
_L2:
        if (b)
        {
            ecs1 = c;
            i1 = abyte0.length;
            if (options == null)
            {
                abyte0 = obj;
            } else
            {
                abyte0 = options.toString();
            }
            abyte0 = String.valueOf(abyte0);
            eev.b("Babel", (new StringBuilder(String.valueOf(ecs1).length() + 64 + String.valueOf(abyte0).length())).append("BitmapPoolICS(").append(ecs1).append(") decodeByteArray ICS for ").append(i1).append(" bytes gave: ").append(abyte0).toString());
        }
        return options;
        ecs1;
        if (b)
        {
            ecs1 = c;
            eev.b("Babel", (new StringBuilder(String.valueOf(ecs1).length() + 41)).append("BitmapPoolICS(").append(ecs1).append(") Unable to use pool bitmap").toString());
        }
        if (options.inBitmap != null)
        {
            options.inBitmap = null;
            ecs1 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
            i1 = e + 1;
            e = i1;
            options = ecs1;
            if (i1 % 100 == 0)
            {
                i1 = e;
                eev.f("Babel", (new StringBuilder(63)).append("Pooled bitmap consistently not being reused count = ").append(i1).toString());
                options = ecs1;
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
        ecu ecu1;
        if (i1 >= f.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ecu1 = (ecu)f.valueAt(i1);
        int j1 = 0;
_L2:
        if (j1 >= ecu1.a)
        {
            break; /* Loop/switch isn't completed */
        }
        c(ecu1.b[j1]);
        ecu1.b[j1] = null;
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        ecu1.a = 0;
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
        gdv.b("Expected condition to be false", aon.a(bitmap));
        if (b)
        {
            gdv.b("Expected condition to be false", b(bitmap));
            gdv.b("Expected condition to be false", edr.a().b(bitmap));
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
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 29 + String.valueOf(s).length())).append("BitmapPoolICS(").append(s1).append(") put bitmap b=").append(s).toString());
        }
        if (bitmap == null)
        {
            bitmap = c;
            eev.d("Babel", (new StringBuilder(String.valueOf(bitmap).length() + 37)).append("BitmapPoolICS(").append(bitmap).append(") receiving null bitmap").toString(), new Exception());
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
        ecu ecu2 = (ecu)f.get(k1);
        ecu ecu1 = ecu2;
        if (ecu2 != null) goto _L2; else goto _L1
_L1:
        if (k1 != m) goto _L4; else goto _L3
_L3:
        int i1 = i;
_L5:
        ecu1 = new ecu(i1);
        f.append(k1, ecu1);
_L2:
        if (ecu1.a >= ecu1.b.length)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        ecu1.b[ecu1.a] = bitmap;
        ecu1.a = ecu1.a + 1;
        if (b)
        {
            bitmap = c;
            String s2 = String.valueOf(a(k1));
            i1 = ecu1.a;
            eev.b("Babel", (new StringBuilder(String.valueOf(bitmap).length() + 79 + String.valueOf(s2).length())).append("BitmapPoolICS(").append(bitmap).append(") putting bitmap into size pool ").append(s2).append(" which now has ").append(i1).append(" items.").toString());
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
            String s4 = String.valueOf(a(k1));
            int j1 = ecu1.a;
            eev.b("Babel", (new StringBuilder(String.valueOf(s3).length() + 92 + String.valueOf(s4).length())).append("BitmapPoolICS(").append(s3).append(") tried putting bitmap into size pool ").append(s4).append(" but it was full with ").append(j1).append(" items.").toString());
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
        ecu ecu1 = (ecu)f.get(k1);
        if (ecu1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (ecu1.a == ecu1.b.length)
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
        ecu ecu1 = (ecu)f.get(i1);
        if (ecu1 != null)
        {
            int j1 = 0;
            while (j1 < ecu1.a) 
            {
                if (ecu1.b[j1] == bitmap)
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
