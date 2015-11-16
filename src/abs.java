// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class abs
{

    private InputStream a;
    private byte b[];
    private boolean c;
    private int d;
    private int e;

    public abs(InputStream inputstream)
    {
        d = 0;
        e = 0;
        a = inputstream;
        b = new byte[e(16)];
        c = false;
    }

    private boolean d(int i)
    {
        l.a("fill");
        if (i < d)
        {
            l.a();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(d)
            }));
        }
        int k = i - d;
        if (a == null)
        {
            l.a();
            return false;
        }
        int i1 = k + 1;
        int j = k;
        if (i1 > b.length)
        {
            if (c)
            {
                c(i);
                j = i - d;
            } else
            {
                i = e(i1);
                String.format("Increasing buffer length from %d to %d. Bad buffer size chosen, or advanceTo() not called.", new Object[] {
                    Integer.valueOf(b.length), Integer.valueOf(i)
                });
                b = Arrays.copyOf(b, i);
                j = k;
            }
        }
        try
        {
            i = a.read(b, e, b.length - e);
        }
        catch (IOException ioexception)
        {
            i = -1;
        }
        if (i != -1)
        {
            e = i + e;
        } else
        {
            a = null;
        }
        if (Log.isLoggable("InputStreamBuffer", 3))
        {
            String.format("fill %d      buffer: %s", new Object[] {
                Integer.valueOf(j), this
            });
        }
        l.a();
        return j < e;
    }

    private static int e(int i)
    {
        i--;
        i |= i >> 1;
        i |= i >> 2;
        i |= i >> 4;
        i |= i >> 8;
        return (i | i >> 16) + 1;
    }

    public byte a(int i)
    {
        l.a("get");
        if (b(i))
        {
            int j = d;
            l.a();
            return b[i - j];
        } else
        {
            l.a();
            throw new IndexOutOfBoundsException(String.format("Index %d beyond length.", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public boolean b(int i)
    {
        l.a("has");
        if (i < d)
        {
            l.a();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(d)
            }));
        }
        int j = i - d;
        if (j >= e || j >= b.length)
        {
            l.a();
            return d(i);
        } else
        {
            l.a();
            return true;
        }
    }

    public void c(int i)
    {
        int l1;
        l.a("advance to");
        l1 = i - d;
        if (l1 <= 0)
        {
            l.a();
            return;
        }
        if (l1 >= e) goto _L2; else goto _L1
_L1:
        if (l1 >= b.length)
        {
            throw new IndexOutOfBoundsException(String.format("Index %d out of bounds. Length %d", new Object[] {
                Integer.valueOf(l1), Integer.valueOf(b.length)
            }));
        }
        for (int j = 0; j + l1 < e; j++)
        {
            b[j] = b[j + l1];
        }

        d = i;
        e = e - l1;
_L11:
        if (Log.isLoggable("InputStreamBuffer", 3))
        {
            String.format("advanceTo %d buffer: %s", new Object[] {
                Integer.valueOf(l1), this
            });
        }
        l.a();
        return;
_L2:
        if (a == null) goto _L4; else goto _L3
_L3:
        int k;
        int j1;
        k = l1 - e;
        j1 = 0;
_L8:
        if (k <= 0) goto _L6; else goto _L5
_L5:
        long l2 = a.skip(k);
        int i1;
        int k1;
        if (l2 <= 0L)
        {
            k1 = j1 + 1;
            i1 = k;
        } else
        {
            i1 = (int)((long)k - l2);
            k1 = j1;
        }
        k = i1;
        j1 = k1;
        if (k1 < 5) goto _L8; else goto _L7
_L7:
        k = 1;
_L9:
        if (k != 0)
        {
            a = null;
        }
        d = i - i1;
        e = 0;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = k;
        k = 0;
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        i1 = k;
        k = 1;
        if (true) goto _L9; else goto _L4
_L4:
        d = i;
        e = 0;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public String toString()
    {
        return String.format("+%d+%d [%d]", new Object[] {
            Integer.valueOf(d), Integer.valueOf(b.length), Integer.valueOf(e)
        });
    }
}
