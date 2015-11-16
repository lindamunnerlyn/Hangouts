// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class kwk
{

    private final ByteBuffer a;

    private kwk(ByteBuffer bytebuffer)
    {
        a = bytebuffer;
        a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private kwk(byte abyte0[], int l, int i1)
    {
        this(ByteBuffer.wrap(abyte0, l, i1));
    }

    private static int a(CharSequence charsequence)
    {
_L2:
        int l;
        if (i1 < l1)
        {
            char c1 = charsequence.charAt(i1);
            if (c1 < '\u0800')
            {
                l += 127 - c1 >>> 31;
                i1++;
                continue; /* Loop/switch isn't completed */
            }
            int j2 = charsequence.length();
            while (i1 < j2) 
            {
                char c2 = charsequence.charAt(i1);
                int k1;
                if (c2 < '\u0800')
                {
                    j1 += 127 - c2 >>> 31;
                    k1 = i1;
                } else
                {
                    int i2 = j1 + 2;
                    k1 = i1;
                    j1 = i2;
                    if ('\uD800' <= c2)
                    {
                        k1 = i1;
                        j1 = i2;
                        if (c2 <= '\uDFFF')
                        {
                            if (Character.codePointAt(charsequence, i1) < 0x10000)
                            {
                                throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(i1).toString());
                            }
                            k1 = i1 + 1;
                            j1 = i2;
                        }
                    }
                }
                i1 = k1 + 1;
            }
            l += j1;
        }
        if (l < l1)
        {
            long l2 = l;
            throw new IllegalArgumentException((new StringBuilder(54)).append("UTF-8 length does not fit in int: ").append(l2 + 0x100000000L).toString());
        } else
        {
            return l;
        }
        int j1 = 0;
        int l1 = charsequence.length();
        int i1;
        for (i1 = 0; i1 < l1 && charsequence.charAt(i1) < '\200'; i1++) { }
        l = l1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int a(CharSequence charsequence, byte abyte0[], int l, int i1)
    {
        int k2;
        int l2;
        k2 = charsequence.length();
        boolean flag = false;
        l2 = l + i1;
        i1 = ((flag) ? 1 : 0);
        do
        {
            if (i1 >= k2 || i1 + l >= l2)
            {
                break;
            }
            char c3 = charsequence.charAt(i1);
            if (c3 >= '\200')
            {
                break;
            }
            abyte0[l + i1] = (byte)c3;
            i1++;
        } while (true);
        if (i1 == k2)
        {
            return l + k2;
        }
        l += i1;
_L2:
        char c1;
        if (i1 >= k2)
        {
            break MISSING_BLOCK_LABEL_483;
        }
        c1 = charsequence.charAt(i1);
        if (c1 >= '\200' || l >= l2)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = l + 1;
        abyte0[l] = (byte)c1;
        l = j1;
_L3:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c1 < '\u0800' && l <= l2 - 2)
        {
            int k1 = l + 1;
            abyte0[l] = (byte)(c1 >>> 6 | 0x3c0);
            l = k1 + 1;
            abyte0[k1] = (byte)(c1 & 0x3f | 0x80);
        } else
        if ((c1 < '\uD800' || '\uDFFF' < c1) && l <= l2 - 3)
        {
            int l1 = l + 1;
            abyte0[l] = (byte)(c1 >>> 12 | 0x1e0);
            int i3 = l1 + 1;
            abyte0[l1] = (byte)(c1 >>> 6 & 0x3f | 0x80);
            l = i3 + 1;
            abyte0[i3] = (byte)(c1 & 0x3f | 0x80);
        } else
        {
label0:
            {
                char c2;
label1:
                {
                    if (l > l2 - 4)
                    {
                        break label0;
                    }
                    int i2 = i1;
                    if (i1 + 1 != charsequence.length())
                    {
                        i1++;
                        c2 = charsequence.charAt(i1);
                        if (Character.isSurrogatePair(c1, c2))
                        {
                            break label1;
                        }
                        i2 = i1;
                    }
                    throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(i2 - 1).toString());
                }
                int j2 = Character.toCodePoint(c1, c2);
                int j3 = l + 1;
                abyte0[l] = (byte)(j2 >>> 18 | 0xf0);
                l = j3 + 1;
                abyte0[j3] = (byte)(j2 >>> 12 & 0x3f | 0x80);
                j3 = l + 1;
                abyte0[l] = (byte)(j2 >>> 6 & 0x3f | 0x80);
                l = j3 + 1;
                abyte0[j3] = (byte)(j2 & 0x3f | 0x80);
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        throw new ArrayIndexOutOfBoundsException((new StringBuilder(37)).append("Failed writing ").append(c1).append(" at index ").append(l).toString());
        return l;
    }

    public static int a(String s)
    {
        int l = a(((CharSequence) (s)));
        return l + h(l);
    }

    public static int a(byte abyte0[])
    {
        return h(abyte0.length) + abyte0.length;
    }

    public static kwk a(byte abyte0[], int l, int i1)
    {
        return new kwk(abyte0, l, i1);
    }

    private static void a(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        if (bytebuffer.isReadOnly())
        {
            throw new ReadOnlyBufferException();
        }
        if (bytebuffer.hasArray())
        {
            try
            {
                bytebuffer.position(a(charsequence, bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining()) - bytebuffer.arrayOffset());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                bytebuffer = new BufferOverflowException();
            }
            bytebuffer.initCause(charsequence);
            throw bytebuffer;
        } else
        {
            b(charsequence, bytebuffer);
            return;
        }
    }

    public static int b(int l)
    {
        return f(l) + 8;
    }

    public static int b(int l, String s)
    {
        return f(l) + a(s);
    }

    public static int b(int l, byte abyte0[])
    {
        return f(l) + a(abyte0);
    }

    public static int b(long l)
    {
        if ((-128L & l) == 0L)
        {
            return 1;
        }
        if ((-16384L & l) == 0L)
        {
            return 2;
        }
        if ((0xffffffffffe00000L & l) == 0L)
        {
            return 3;
        }
        if ((0xfffffffff0000000L & l) == 0L)
        {
            return 4;
        }
        if ((0xfffffff800000000L & l) == 0L)
        {
            return 5;
        }
        if ((0xfffffc0000000000L & l) == 0L)
        {
            return 6;
        }
        if ((0xfffe000000000000L & l) == 0L)
        {
            return 7;
        }
        if ((0xff00000000000000L & l) == 0L)
        {
            return 8;
        }
        return (0x8000000000000000L & l) != 0L ? 10 : 9;
    }

    private static void b(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        int l;
        int k1;
        k1 = charsequence.length();
        l = 0;
_L2:
        char c1;
        if (l >= k1)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        c1 = charsequence.charAt(l);
        if (c1 >= '\200')
        {
            break; /* Loop/switch isn't completed */
        }
        bytebuffer.put((byte)c1);
_L3:
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c1 < '\u0800')
        {
            bytebuffer.put((byte)(c1 >>> 6 | 0x3c0));
            bytebuffer.put((byte)(c1 & 0x3f | 0x80));
        } else
        if (c1 < '\uD800' || '\uDFFF' < c1)
        {
            bytebuffer.put((byte)(c1 >>> 12 | 0x1e0));
            bytebuffer.put((byte)(c1 >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(c1 & 0x3f | 0x80));
        } else
        {
            char c2;
label0:
            {
                int i1 = l;
                if (l + 1 != charsequence.length())
                {
                    l++;
                    c2 = charsequence.charAt(l);
                    if (Character.isSurrogatePair(c1, c2))
                    {
                        break label0;
                    }
                    i1 = l;
                }
                throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(i1 - 1).toString());
            }
            int j1 = Character.toCodePoint(c1, c2);
            bytebuffer.put((byte)(j1 >>> 18 | 0xf0));
            bytebuffer.put((byte)(j1 >>> 12 & 0x3f | 0x80));
            bytebuffer.put((byte)(j1 >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(j1 & 0x3f | 0x80));
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static int c(int l)
    {
        return f(l) + 4;
    }

    public static int c(int l, kws kws1)
    {
        return (f(l) << 1) + kws1.getSerializedSize();
    }

    public static long c(long l)
    {
        return l << 1 ^ l >> 63;
    }

    public static int d(int l)
    {
        return f(l) + 1;
    }

    public static int d(int l, long l1)
    {
        return f(l) + b(l1);
    }

    public static int d(int l, kws kws1)
    {
        l = f(l);
        int i1 = kws1.getSerializedSize();
        return l + (i1 + h(i1));
    }

    private void d(long l)
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                j((int)l);
                return;
            }
            j((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public static int e(int l)
    {
        if (l >= 0)
        {
            return h(l);
        } else
        {
            return 10;
        }
    }

    public static int e(int l, int i1)
    {
        return f(l) + e(i1);
    }

    public static int e(int l, long l1)
    {
        return f(l) + b(l1);
    }

    private void e(long l)
    {
        if (a.remaining() < 8)
        {
            throw new kwl(a.position(), a.limit());
        } else
        {
            a.putLong(l);
            return;
        }
    }

    public static int f(int l)
    {
        return h(l << 3);
    }

    public static int f(int l, int i1)
    {
        return f(l) + h(i1);
    }

    public static int h(int l)
    {
        if ((l & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((l & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & l) == 0)
        {
            return 3;
        }
        return (0xf0000000 & l) != 0 ? 5 : 4;
    }

    public static int i(int l)
    {
        return l << 1 ^ l >> 31;
    }

    private void j(int l)
    {
        byte byte0 = (byte)l;
        if (!a.hasRemaining())
        {
            throw new kwl(a.position(), a.limit());
        } else
        {
            a.put(byte0);
            return;
        }
    }

    private void k(int l)
    {
        if (a.remaining() < 4)
        {
            throw new kwl(a.position(), a.limit());
        } else
        {
            a.putInt(l);
            return;
        }
    }

    public void a()
    {
        if (a.remaining() != 0)
        {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else
        {
            return;
        }
    }

    public void a(int l)
    {
        g(4, 0);
        g(i(l));
    }

    public void a(int l, double d1)
    {
        g(l, 1);
        e(Double.doubleToLongBits(d1));
    }

    public void a(int l, float f1)
    {
        g(l, 5);
        k(Float.floatToIntBits(f1));
    }

    public void a(int l, int i1)
    {
        g(l, 0);
        if (i1 >= 0)
        {
            g(i1);
            return;
        } else
        {
            d(i1);
            return;
        }
    }

    public void a(int l, long l1)
    {
        g(l, 0);
        d(l1);
    }

    public void a(int l, String s)
    {
        g(l, 2);
        kwl kwl1;
        int i1;
        l = h(s.length());
        if (l != h(s.length() * 3))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        i1 = a.position();
        if (a.remaining() < l)
        {
            throw new kwl(l + i1, a.limit());
        }
        try
        {
            a.position(i1 + l);
            a(((CharSequence) (s)), a);
            int j1 = a.position();
            a.position(i1);
            g(j1 - i1 - l);
            a.position(j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            kwl1 = new kwl(a.position(), a.limit());
            kwl1.initCause(s);
            throw kwl1;
        }
        g(a(((CharSequence) (s))));
        a(((CharSequence) (s)), a);
        return;
    }

    public void a(int l, kws kws1)
    {
        g(l, 3);
        a(kws1);
        g(l, 4);
    }

    public void a(int l, boolean flag)
    {
        boolean flag1 = false;
        g(l, 0);
        l = ((flag1) ? 1 : 0);
        if (flag)
        {
            l = 1;
        }
        byte byte0 = (byte)l;
        if (!a.hasRemaining())
        {
            throw new kwl(a.position(), a.limit());
        } else
        {
            a.put(byte0);
            return;
        }
    }

    public void a(int l, byte abyte0[])
    {
        g(l, 2);
        g(abyte0.length);
        b(abyte0);
    }

    public void a(long l)
    {
        g(5, 0);
        d(c(l));
    }

    public void a(kws kws1)
    {
        kws1.writeTo(this);
    }

    public void b(int l, int i1)
    {
        g(l, 5);
        k(i1);
    }

    public void b(int l, long l1)
    {
        g(l, 0);
        d(l1);
    }

    public void b(int l, kws kws1)
    {
        g(l, 2);
        b(kws1);
    }

    public void b(kws kws1)
    {
        g(kws1.getCachedSize());
        kws1.writeTo(this);
    }

    public void b(byte abyte0[])
    {
        int l = abyte0.length;
        if (a.remaining() >= l)
        {
            a.put(abyte0, 0, l);
            return;
        } else
        {
            throw new kwl(a.position(), a.limit());
        }
    }

    public void c(int l, int i1)
    {
        g(l, 0);
        g(i1);
    }

    public void c(int l, long l1)
    {
        g(l, 1);
        e(l1);
    }

    public void d(int l, int i1)
    {
        g(l, 5);
        k(i1);
    }

    public void g(int l)
    {
        do
        {
            if ((l & 0xffffff80) == 0)
            {
                j(l);
                return;
            }
            j(l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public void g(int l, int i1)
    {
        g(l << 3 | i1);
    }
}
