// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

public final class ebh
    implements dnb
{

    public static int a = 1;
    private static final boolean b = false;
    private static final Object c = new Object();
    private Bitmap d;
    private int e;
    private final int f;
    private final String g;
    private boolean h;
    private int i;

    public ebh(Bitmap bitmap, String s)
    {
        e = 0;
        h = false;
        int k;
        if (bitmap == null)
        {
            k = 1;
        } else
        {
            k = bitmap.getByteCount();
        }
        synchronized (c)
        {
            d = bitmap;
            g = s;
            f = k;
            k = a;
            a = k + 1;
            i = k;
        }
        if (b)
        {
            bitmap = String.valueOf(toString());
            if (bitmap.length() != 0)
            {
                bitmap = "RefcountedBitmap created: ".concat(bitmap);
            } else
            {
                bitmap = new String("RefcountedBitmap created: ");
            }
            ebw.b("Babel", bitmap);
        }
        return;
        bitmap;
        obj;
        JVM INSTR monitorexit ;
        throw bitmap;
    }

    private void j()
    {
        boolean flag1 = true;
        boolean flag;
        if (e > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        if (i > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
    }

    public void a()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!b) goto _L2; else goto _L1
_L1:
        String s;
        s = String.valueOf(toString());
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        s = "RefcountedBitmap acquire :".concat(s);
_L4:
        ebw.b("Babel", s);
_L2:
        e = e + 1;
        return;
        s = new String("RefcountedBitmap acquire :");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean a(int k, int l)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        return d != null && d.getWidth() == k && d.getHeight() == l;
    }

    public void b()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!b) goto _L2; else goto _L1
_L1:
        String s;
        s = String.valueOf(toString());
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s = "RefcountedBitmap release : ".concat(s);
_L3:
        ebw.b("Babel", s);
_L2:
        Exception exception;
        boolean flag;
        if (e > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        e = e - 1;
        obj;
        JVM INSTR monitorexit ;
        return;
        s = new String("RefcountedBitmap release : ");
          goto _L3
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Bitmap c()
    {
        Object obj1 = null;
        Object obj2 = c;
        obj2;
        JVM INSTR monitorenter ;
        if (!b) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = String.valueOf(toString());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        obj = "RefcountedBitmap dispose : ".concat(((String) (obj)));
_L3:
        ebw.b("Babel", ((String) (obj)));
_L2:
        obj = obj1;
        if (h)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        obj = obj1;
        if (d != null)
        {
            obj = d;
        }
        i = -i;
        d = null;
        obj2;
        JVM INSTR monitorexit ;
        return ((Bitmap) (obj));
        obj = new String("RefcountedBitmap dispose : ");
          goto _L3
        Exception exception;
        exception;
        obj2;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Bitmap d()
    {
        Object obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        if (!b) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = String.valueOf(toString());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj = "RefcountedBitmap getBitmapWithoutRefcount : ".concat(((String) (obj)));
_L3:
        ebw.b("Babel", ((String) (obj)));
_L2:
        j();
        obj = d;
        h = true;
        b();
        return ((Bitmap) (obj));
        obj = new String("RefcountedBitmap getBitmapWithoutRefcount : ");
          goto _L3
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Bitmap e()
    {
        j();
        return d;
    }

    Bitmap f()
    {
        return d;
    }

    public boolean g()
    {
        return d != null && d.isMutable();
    }

    public String h()
    {
        return g;
    }

    public int i()
    {
        return e;
    }

    public String toString()
    {
        int k = i;
        int l = e;
        String s = g;
        boolean flag = h;
        int i1 = f;
        String s1 = String.valueOf(d);
        return (new StringBuilder(String.valueOf(s).length() + 98 + String.valueOf(s1).length())).append("RefCountedBitmap id=").append(k).append(" count=").append(l).append(" key=").append(s).append(" dontreturn=").append(flag).append(" size=").append(i1).append(" bitmap = ").append(s1).toString();
    }

    static 
    {
        hik hik = ebw.u;
    }
}
