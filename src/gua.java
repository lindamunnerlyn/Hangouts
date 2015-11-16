// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public final class gua
{

    private static final Charset a = Charset.forName("US-ASCII");
    private static final int b[];
    private static final SimpleDateFormat j = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
    private final short c;
    private final short d;
    private boolean e;
    private int f;
    private int g;
    private Object h;
    private int i;

    gua(short word0, short word1, int l, int i1, boolean flag)
    {
        c = word0;
        d = word1;
        f = l;
        e = flag;
        g = i1;
        h = null;
    }

    public static boolean a(int l)
    {
        return l == 0 || l == 1 || l == 2 || l == 3 || l == 4;
    }

    public static boolean a(short word0)
    {
        return word0 == 1 || word0 == 2 || word0 == 3 || word0 == 4 || word0 == 5 || word0 == 7 || word0 == 9 || word0 == 10;
    }

    private static String b(short word0)
    {
        switch (word0)
        {
        case 6: // '\006'
        case 8: // '\b'
        default:
            return "";

        case 1: // '\001'
            return "UNSIGNED_BYTE";

        case 2: // '\002'
            return "ASCII";

        case 3: // '\003'
            return "UNSIGNED_SHORT";

        case 4: // '\004'
            return "UNSIGNED_LONG";

        case 5: // '\005'
            return "UNSIGNED_RATIONAL";

        case 7: // '\007'
            return "UNDEFINED";

        case 9: // '\t'
            return "LONG";

        case 10: // '\n'
            return "RATIONAL";
        }
    }

    private boolean h(int l)
    {
        return e && f != l;
    }

    public int a()
    {
        return g;
    }

    protected void a(boolean flag)
    {
        e = flag;
    }

    public boolean a(Object obj)
    {
        int l = 0;
        if (obj != null)
        {
            if (obj instanceof Short)
            {
                return d(((Short)obj).shortValue() & 0xffff);
            }
            if (obj instanceof String)
            {
                return a((String)obj);
            }
            if (obj instanceof int[])
            {
                return a((int[])obj);
            }
            if (obj instanceof long[])
            {
                return a((long[])obj);
            }
            if (obj instanceof gud)
            {
                return a(new gud[] {
                    (gud)obj
                });
            }
            if (obj instanceof gud[])
            {
                return a((gud[])obj);
            }
            if (obj instanceof byte[])
            {
                return a((byte[])obj);
            }
            if (obj instanceof Integer)
            {
                return d(((Integer)obj).intValue());
            }
            if (obj instanceof Long)
            {
                return a(new long[] {
                    ((Long)obj).longValue()
                });
            }
            if (obj instanceof Byte)
            {
                return a(new byte[] {
                    ((Byte)obj).byteValue()
                });
            }
            if (obj instanceof Short[])
            {
                obj = (Short[])obj;
                int ai[] = new int[obj.length];
                l = 0;
                while (l < obj.length) 
                {
                    int j1;
                    if (obj[l] == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = obj[l].shortValue() & 0xffff;
                    }
                    ai[l] = j1;
                    l++;
                }
                return a(ai);
            }
            if (obj instanceof Integer[])
            {
                obj = (Integer[])obj;
                int ai1[] = new int[obj.length];
                l = 0;
                while (l < obj.length) 
                {
                    int k1;
                    if (obj[l] == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = obj[l].intValue();
                    }
                    ai1[l] = k1;
                    l++;
                }
                return a(ai1);
            }
            if (obj instanceof Long[])
            {
                obj = (Long[])obj;
                long al[] = new long[obj.length];
                while (l < obj.length) 
                {
                    long l1;
                    if (obj[l] == null)
                    {
                        l1 = 0L;
                    } else
                    {
                        l1 = obj[l].longValue();
                    }
                    al[l] = l1;
                    l++;
                }
                return a(al);
            }
            if (obj instanceof Byte[])
            {
                obj = (Byte[])obj;
                byte abyte0[] = new byte[obj.length];
                int i1 = 0;
                while (i1 < obj.length) 
                {
                    byte byte0;
                    if (obj[i1] == null)
                    {
                        byte0 = 0;
                    } else
                    {
                        byte0 = obj[i1].byteValue();
                    }
                    abyte0[i1] = byte0;
                    i1++;
                }
                return a(abyte0);
            }
        }
        return false;
    }

    public boolean a(String s)
    {
        if (d != 2 && d != 7)
        {
            return false;
        }
        byte abyte0[] = s.getBytes(a);
        int l;
        if (abyte0.length > 0)
        {
            s = abyte0;
            if (d == 2)
            {
                s = abyte0;
                if (abyte0[abyte0.length - 1] != 0)
                {
                    if (e && abyte0.length == f)
                    {
                        abyte0[abyte0.length - 1] = 0;
                        s = abyte0;
                    } else
                    {
                        s = Arrays.copyOf(abyte0, abyte0.length + 1);
                    }
                }
            }
        } else
        {
            s = abyte0;
            if (d == 2)
            {
                s = abyte0;
                if (f == 1)
                {
                    s = new byte[1];
                    s[0] = 0;
                }
            }
        }
        l = s.length;
        if (h(l))
        {
            return false;
        } else
        {
            f = l;
            h = s;
            return true;
        }
    }

    public boolean a(byte abyte0[])
    {
        int l;
        for (l = abyte0.length; h(l) || d != 1 && d != 7;)
        {
            return false;
        }

        h = new byte[l];
        System.arraycopy(abyte0, 0, h, 0, l);
        f = l;
        return true;
    }

    public boolean a(int ai[])
    {
        boolean flag;
        flag = false;
        break MISSING_BLOCK_LABEL_3;
_L6:
        int l;
        int i1;
        do
        {
            return false;
        } while (h(ai.length) || d != 3 && d != 9 && d != 4);
        if (d != 3)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ai.length;
        l = 0;
_L10:
        if (l >= i1) goto _L2; else goto _L1
_L1:
        int j1 = ai[l];
        if (j1 <= 65535 && j1 >= 0) goto _L4; else goto _L3
_L3:
        l = 1;
_L11:
        if (l != 0) goto _L6; else goto _L5
_L5:
        if (d != 4)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ai.length;
        l = 0;
_L12:
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (ai[l] >= 0) goto _L8; else goto _L7
_L7:
        l = 1;
_L13:
        if (l != 0) goto _L6; else goto _L9
_L9:
        long al[];
        al = new long[ai.length];
        for (l = ((flag) ? 1 : 0); l < ai.length; l++)
        {
            al[l] = ai[l];
        }

        break MISSING_BLOCK_LABEL_166;
_L4:
        l++;
          goto _L10
_L2:
        l = 0;
          goto _L11
_L8:
        l++;
          goto _L12
        l = 0;
          goto _L13
        h = al;
        f = ai.length;
        return true;
          goto _L10
    }

    public boolean a(long al[])
    {
        if (!h(al.length) && d == 4) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int l;
        int i1;
        i1 = al.length;
        l = 0;
_L5:
        long l1;
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        l1 = al[l];
        if (l1 >= 0L && l1 <= 0xffffffffL) goto _L4; else goto _L3
_L3:
        l = 1;
_L6:
        if (l == 0)
        {
            h = al;
            f = al.length;
            return true;
        }
          goto _L1
_L4:
        l++;
          goto _L5
        l = 0;
          goto _L6
    }

    public boolean a(gud agud[])
    {
_L2:
        return false;
        if (h(agud.length) || d != 5 && d != 10) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        if (d != 5)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = agud.length;
        l = 0;
_L11:
        if (l >= i1) goto _L4; else goto _L3
_L3:
        gud gud1 = agud[l];
        if (gud1.a() >= 0L && gud1.b() >= 0L && gud1.a() <= 0xffffffffL && gud1.b() <= 0xffffffffL) goto _L6; else goto _L5
_L5:
        l = 1;
_L12:
        if (l != 0) goto _L2; else goto _L7
_L7:
        if (d != 10)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = agud.length;
        l = 0;
_L13:
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        gud1 = agud[l];
        if (gud1.a() >= 0xffffffff80000000L && gud1.b() >= 0xffffffff80000000L && gud1.a() <= 0x7fffffffL && gud1.b() <= 0x7fffffffL) goto _L9; else goto _L8
_L8:
        l = 1;
_L14:
        if (l != 0) goto _L2; else goto _L10
_L10:
        h = agud;
        f = agud.length;
        return true;
_L6:
        l++;
          goto _L11
_L4:
        l = 0;
          goto _L12
_L9:
        l++;
          goto _L13
        l = 0;
          goto _L14
    }

    public short b()
    {
        return c;
    }

    protected void b(int l)
    {
        g = l;
    }

    protected void b(byte abyte0[])
    {
        int l = abyte0.length;
        if (d != 7 && d != 1)
        {
            abyte0 = String.valueOf(b(d));
            if (abyte0.length() != 0)
            {
                abyte0 = "Cannot get BYTE value from ".concat(abyte0);
            } else
            {
                abyte0 = new String("Cannot get BYTE value from ");
            }
            throw new IllegalArgumentException(abyte0);
        } else
        {
            System.arraycopy(h, 0, abyte0, 0, Math.min(f, l));
            return;
        }
    }

    public short c()
    {
        return d;
    }

    protected void c(int l)
    {
        f = l;
    }

    public int d()
    {
        int l = e();
        short word0 = c();
        return l * b[word0];
    }

    public boolean d(int l)
    {
        return a(new int[] {
            l
        });
    }

    public int e()
    {
        return f;
    }

    protected long e(int l)
    {
        if (h instanceof long[])
        {
            return ((long[])h)[l];
        }
        if (h instanceof byte[])
        {
            return (long)((byte[])h)[l];
        }
        String s = String.valueOf(b(d));
        if (s.length() != 0)
        {
            s = "Cannot get integer value from ".concat(s);
        } else
        {
            s = new String("Cannot get integer value from ");
        }
        throw new IllegalArgumentException(s);
    }

    public boolean equals(Object obj)
    {
_L2:
        return false;
        if (obj == null || !(obj instanceof gua)) goto _L2; else goto _L1
_L1:
        obj = (gua)obj;
        if (((gua) (obj)).c != c || ((gua) (obj)).f != f || ((gua) (obj)).d != d)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (h == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((gua) (obj)).h == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!(h instanceof long[]))
        {
            break; /* Loop/switch isn't completed */
        }
        if (((gua) (obj)).h instanceof long[])
        {
            return Arrays.equals((long[])h, (long[])((gua) (obj)).h);
        }
        if (true) goto _L2; else goto _L3
_L3:
        if (!(h instanceof gud[]))
        {
            break; /* Loop/switch isn't completed */
        }
        if (((gua) (obj)).h instanceof gud[])
        {
            return Arrays.equals((gud[])h, (gud[])((gua) (obj)).h);
        }
        if (true) goto _L2; else goto _L4
_L4:
        if (h instanceof byte[])
        {
            if (((gua) (obj)).h instanceof byte[])
            {
                return Arrays.equals((byte[])h, (byte[])((gua) (obj)).h);
            }
        } else
        {
            return h.equals(((gua) (obj)).h);
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (((gua) (obj)).h != null) goto _L2; else goto _L6
_L6:
        return true;
    }

    protected gud f(int l)
    {
        if (d != 10 && d != 5)
        {
            String s = String.valueOf(b(d));
            if (s.length() != 0)
            {
                s = "Cannot get RATIONAL value from ".concat(s);
            } else
            {
                s = new String("Cannot get RATIONAL value from ");
            }
            throw new IllegalArgumentException(s);
        } else
        {
            return ((gud[])h)[l];
        }
    }

    public boolean f()
    {
        return h != null;
    }

    protected void g(int l)
    {
        i = l;
    }

    public int[] g()
    {
        while (h == null || !(h instanceof long[])) 
        {
            return null;
        }
        long al[] = (long[])h;
        int ai[] = new int[al.length];
        for (int l = 0; l < al.length; l++)
        {
            ai[l] = (int)al[l];
        }

        return ai;
    }

    public Object h()
    {
        return h;
    }

    public int hashCode()
    {
        short word0 = c;
        int i1 = f;
        short word1 = d;
        int l;
        if (h == null)
        {
            l = 0;
        } else
        {
            l = h.hashCode();
        }
        return l + (((word0 + 527) * 31 + i1) * 31 + word1) * 31;
    }

    protected byte[] i()
    {
        return (byte[])h;
    }

    protected int j()
    {
        return i;
    }

    protected boolean k()
    {
        return e;
    }

    public String toString()
    {
        String s;
        String s1;
        int l;
        int i1;
        int j1;
        s = String.valueOf(String.format("tag id: %04X\n", new Object[] {
            Short.valueOf(c)
        }));
        l = g;
        s1 = b(d);
        i1 = f;
        j1 = i;
        if (h != null) goto _L2; else goto _L1
_L1:
        Object obj = "";
_L4:
        return (new StringBuilder(String.valueOf(s).length() + 74 + String.valueOf(s1).length() + String.valueOf(obj).length())).append(s).append("ifd id: ").append(l).append("\ntype: ").append(s1).append("\ncount: ").append(i1).append("\noffset: ").append(j1).append("\nvalue: ").append(((String) (obj))).append("\n").toString();
_L2:
        if (h instanceof byte[])
        {
            if (d == 2)
            {
                if (h != null)
                {
                    if (h instanceof String)
                    {
                        obj = (String)h;
                        continue; /* Loop/switch isn't completed */
                    }
                    if (h instanceof byte[])
                    {
                        obj = (byte[])h;
                        if (obj.length > 0 && obj[obj.length - 1] == 0)
                        {
                            obj = new String(((byte []) (obj)), 0, obj.length - 1, a);
                        } else
                        {
                            obj = new String(((byte []) (obj)), a);
                        }
                        continue; /* Loop/switch isn't completed */
                    }
                }
                obj = null;
            } else
            {
                obj = Arrays.toString((byte[])h);
            }
        } else
        if (h instanceof long[])
        {
            if (((long[])h).length == 1)
            {
                obj = String.valueOf(((long[])h)[0]);
            } else
            {
                obj = Arrays.toString((long[])h);
            }
        } else
        if (h instanceof Object[])
        {
            if (((Object[])h).length == 1)
            {
                obj = ((Object[])h)[0];
                if (obj == null)
                {
                    obj = "";
                } else
                {
                    obj = obj.toString();
                }
            } else
            {
                obj = Arrays.toString((Object[])h);
            }
        } else
        {
            obj = h.toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        int ai[] = new int[11];
        b = ai;
        ai[1] = 1;
        b[2] = 1;
        b[3] = 2;
        b[4] = 4;
        b[5] = 8;
        b[7] = 1;
        b[9] = 4;
        b[10] = 8;
    }
}
