// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import android.util.Log;

public final class gdv
{

    public static volatile boolean a = true;
    public static volatile boolean b = true;

    public static void a()
    {
        while (!b || Looper.myLooper() == Looper.getMainLooper() || Thread.currentThread().getName().contains("test")) 
        {
            return;
        }
        String s = String.valueOf(Looper.myLooper());
        throw new AssertionError((new StringBuilder(String.valueOf(s).length() + 32)).append("Expected main thread instead of ").append(s).toString());
    }

    public static void a(int i, int j, int k)
    {
        a("", i, j, k);
    }

    public static void a(Object obj, Object obj1)
    {
        String s;
        try
        {
            s = String.format("Expected %s and %s to be equal.", new Object[] {
                obj, obj1
            });
        }
        catch (Throwable throwable)
        {
            throwable = "Expected objects to be equal.";
        }
        a(s, obj, obj1);
    }

    public static void a(String s)
    {
        if (a)
        {
            throw new AssertionError(s);
        } else
        {
            return;
        }
    }

    public static void a(String s, int i, int j, int k)
    {
        if (a && (i < j || i > k))
        {
            Log.e("vclib", String.format("Expected value in range [%d, %d], but was %d. %s", new Object[] {
                Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), s
            }));
            throw new AssertionError(String.format("Value is out of range [%d, %d]", new Object[] {
                Integer.valueOf(j), Integer.valueOf(k)
            }));
        } else
        {
            return;
        }
    }

    public static void a(String s, Object obj)
    {
        if (a && obj != null)
        {
            throw new AssertionError(s);
        } else
        {
            return;
        }
    }

    public static void a(String s, Object obj, Object obj1)
    {
        if (a && (obj != null ? !obj.equals(obj1) : obj1 != null))
        {
            Log.e("vclib", s);
            throw new AssertionError("Expected objects to be equal.");
        } else
        {
            return;
        }
    }

    public static void a(String s, boolean flag)
    {
        if (a && !flag)
        {
            throw new AssertionError(s);
        } else
        {
            return;
        }
    }

    public static void a(boolean flag)
    {
        b("Expected condition to be false", flag);
    }

    public static Object b(String s, Object obj)
    {
        if (a && obj == null)
        {
            throw new AssertionError(s);
        } else
        {
            return obj;
        }
    }

    public static void b()
    {
        while (!b || Looper.myLooper() != Looper.getMainLooper()) 
        {
            return;
        }
        throw new AssertionError("Main thread unexpected");
    }

    public static void b(Object obj, Object obj1)
    {
        String s;
        try
        {
            s = String.format("Expected different objects in %s and %s.", new Object[] {
                obj, obj1
            });
        }
        catch (Throwable throwable)
        {
            throwable = "Expected objects to be not equal.";
        }
        b(s, obj, obj1);
    }

    public static void b(String s, Object obj, Object obj1)
    {
        if (a && obj == obj1)
        {
            Log.e("vclib", s);
            throw new AssertionError("Expected objects to be not equal.");
        } else
        {
            return;
        }
    }

    public static void b(String s, boolean flag)
    {
        if (a && flag)
        {
            throw new AssertionError(s);
        } else
        {
            return;
        }
    }

    public static void c()
    {
        while (!b || Thread.currentThread().getName().startsWith("GLThread") || Thread.currentThread().getName().contains("test")) 
        {
            return;
        }
        String s = String.valueOf(Thread.currentThread());
        throw new AssertionError((new StringBuilder(String.valueOf(s).length() + 40)).append("Expected GL rendering thread instead of ").append(s).toString());
    }

    public static void d()
    {
        while (!b || Thread.currentThread().getName().equals("CameraOpenThread") || Thread.currentThread().getName().contains("test")) 
        {
            return;
        }
        String s = String.valueOf(Thread.currentThread());
        throw new AssertionError((new StringBuilder(String.valueOf(s).length() + 49)).append("Expected CameraOpen background thread instead of ").append(s).toString());
    }

    public static void e()
    {
        while (!b || Thread.currentThread().getName().equals("DecoderHandlerThread") || Thread.currentThread().getName().contains("test")) 
        {
            return;
        }
        String s = String.valueOf(Thread.currentThread());
        throw new AssertionError((new StringBuilder(String.valueOf(s).length() + 35)).append("Expected Decoder thread instead of ").append(s).toString());
    }

    public static void f()
    {
        while (!b || Thread.currentThread().getName().equals("EncoderHandlerThread") || Thread.currentThread().getName().contains("test")) 
        {
            return;
        }
        String s = String.valueOf(Thread.currentThread());
        throw new AssertionError((new StringBuilder(String.valueOf(s).length() + 35)).append("Expected Encoder thread instead of ").append(s).toString());
    }

}
