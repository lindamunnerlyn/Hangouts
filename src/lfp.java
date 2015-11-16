// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class lfp
{

    private ArrayList a;
    private Object b;

    public lfp()
    {
        a = new ArrayList();
    }

    private lfp a(Object obj)
    {
        b = null;
        a.add(obj);
        a.add(obj);
        return this;
    }

    private lfp a(lcz lcz1)
    {
        if (lcz1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        } else
        {
            return a(new lfy(lcz1, false));
        }
    }

    private lfp a(lcz lcz1, int i1, int j1)
    {
        if (lcz1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int k1 = j1;
        if (j1 < i1)
        {
            k1 = i1;
        }
        if (i1 < 0 || k1 <= 0)
        {
            throw new IllegalArgumentException();
        }
        if (i1 <= 1)
        {
            return a(new lgd(lcz1, k1, false));
        } else
        {
            return a(new lfw(lcz1, k1, false, i1));
        }
    }

    private lfp a(lgi lgi1, lge lge1)
    {
        b = null;
        a.add(lgi1);
        a.add(lge1);
        return this;
    }

    static void a(StringBuffer stringbuffer, int i1)
    {
        do
        {
            i1--;
            if (i1 >= 0)
            {
                stringbuffer.append('\uFFFD');
            } else
            {
                return;
            }
        } while (true);
    }

    private lfp b(lcz lcz1)
    {
        if (lcz1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        } else
        {
            return a(new lfy(lcz1, true));
        }
    }

    private lfp b(lcz lcz1, int i1, int j1)
    {
        if (lcz1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int k1 = j1;
        if (j1 < i1)
        {
            k1 = i1;
        }
        if (i1 < 0 || k1 <= 0)
        {
            throw new IllegalArgumentException();
        }
        if (i1 <= 1)
        {
            return a(new lgd(lcz1, k1, true));
        } else
        {
            return a(new lfw(lcz1, k1, true, i1));
        }
    }

    private static boolean b(Object obj)
    {
        if (obj instanceof lge)
        {
            if (obj instanceof lfr)
            {
                return ((lfr)obj).d();
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

    private lfp c(lcz lcz1, int i1, int j1)
    {
        if (lcz1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int k1 = j1;
        if (j1 < i1)
        {
            k1 = i1;
        }
        if (i1 < 0 || k1 <= 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            return a(new lft(lcz1, i1, k1));
        }
    }

    private static void c(lge lge1)
    {
        if (lge1 == null)
        {
            throw new IllegalArgumentException("No parser supplied");
        } else
        {
            return;
        }
    }

    private Object n()
    {
        Object obj;
        Object obj1;
        obj1 = b;
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (a.size() != 2) goto _L4; else goto _L3
_L3:
        Object obj3;
        Object obj4;
        obj3 = a.get(0);
        obj4 = a.get(1);
        if (obj3 == null) goto _L6; else goto _L5
_L5:
        if (obj3 == obj4) goto _L8; else goto _L7
_L7:
        obj = obj1;
        if (obj4 != null) goto _L4; else goto _L8
_L8:
        obj = obj3;
_L4:
        Object obj2 = obj;
        if (obj == null)
        {
            obj2 = new lfr(a);
        }
        b = obj2;
        obj = obj2;
_L2:
        return obj;
_L6:
        obj = obj4;
        if (true) goto _L4; else goto _L9
_L9:
    }

    public lfo a()
    {
        Object obj = n();
        lgi lgi1;
        boolean flag;
        if (obj instanceof lgi)
        {
            if (obj instanceof lfr)
            {
                flag = ((lfr)obj).c();
            } else
            {
                flag = true;
            }
        } else
        {
            flag = false;
        }
        if (flag)
        {
            lgi1 = (lgi)obj;
        } else
        {
            lgi1 = null;
        }
        if (b(obj))
        {
            obj = (lge)obj;
        } else
        {
            obj = null;
        }
        if (lgi1 != null || obj != null)
        {
            return new lfo(lgi1, ((lge) (obj)));
        } else
        {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
    }

    public lfp a(char c1)
    {
        return a(new lfq(c1));
    }

    public lfp a(int i1)
    {
        return a(lcz.c(), i1, 2);
    }

    public lfp a(int i1, int j1)
    {
        return c(lcz.d(), i1, j1);
    }

    public lfp a(int i1, boolean flag)
    {
        return a(new lgc(lcz.s(), i1, flag));
    }

    public lfp a(String s)
    {
        lfp lfp1 = this;
        switch (s.length())
        {
        default:
            lfp1 = a(new lfx(s));
            // fall through

        case 0: // '\0'
            return lfp1;

        case 1: // '\001'
            return a(new lfq(s.charAt(0)));
        }
    }

    public lfp a(String s, boolean flag)
    {
        return a(new lgb(null, s, flag, 2, 2));
    }

    public lfp a(String s, boolean flag, int i1)
    {
        return a(new lgb(s, s, flag, 2, i1));
    }

    public lfp a(lcz lcz1, int i1)
    {
        if (lcz1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i1 <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder(37)).append("Illegal number of digits: ").append(i1).toString());
        } else
        {
            return a(new lfs(lcz1, i1));
        }
    }

    public lfp a(lfo lfo1)
    {
        if (lfo1 == null)
        {
            throw new IllegalArgumentException("No formatter supplied");
        } else
        {
            return a(lfo1.a(), lfo1.b());
        }
    }

    public lfp a(lge lge1)
    {
        c(lge1);
        return a(((lgi) (null)), lge1);
    }

    public lfp a(lge alge[])
    {
        int i1 = 0;
        int j1 = alge.length;
        if (j1 == 1)
        {
            if (alge[0] == null)
            {
                throw new IllegalArgumentException("No parser supplied");
            } else
            {
                return a(((lgi) (null)), alge[0]);
            }
        }
        lge alge1[] = new lge[j1];
        for (; i1 < j1 - 1; i1++)
        {
            lge lge1 = alge[i1];
            alge1[i1] = lge1;
            if (lge1 == null)
            {
                throw new IllegalArgumentException("Incomplete parser array");
            }
        }

        alge1[i1] = alge[i1];
        return a(((lgi) (null)), ((lge) (new lfu(alge1))));
    }

    public lfp b(int i1)
    {
        return a(lcz.e(), i1, 2);
    }

    public lfp b(int i1, int j1)
    {
        return b(lcz.p(), i1, j1);
    }

    public lfp b(int i1, boolean flag)
    {
        return a(new lgc(lcz.p(), i1, flag));
    }

    public lfp b(lge lge1)
    {
        c(lge1);
        return a(((lgi) (null)), new lfu(new lge[] {
            lge1, null
        }));
    }

    public lge b()
    {
        Object obj = n();
        if (b(obj))
        {
            return (lge)obj;
        } else
        {
            throw new UnsupportedOperationException("Parsing is not supported");
        }
    }

    public lfp c()
    {
        return c(lcz.f(), 1, 9);
    }

    public lfp c(int i1)
    {
        return a(lcz.g(), i1, 2);
    }

    public lfp c(int i1, int j1)
    {
        return b(lcz.s(), i1, j1);
    }

    public lfp d()
    {
        return c(lcz.g(), 1, 9);
    }

    public lfp d(int i1)
    {
        return a(lcz.h(), i1, 2);
    }

    public lfp d(int i1, int j1)
    {
        return a(lcz.t(), i1, j1);
    }

    public lfp e()
    {
        return a(lcz.k());
    }

    public lfp e(int i1)
    {
        return a(lcz.i(), i1, 2);
    }

    public lfp e(int i1, int j1)
    {
        return b(lcz.v(), i1, j1);
    }

    public lfp f()
    {
        return a(lcz.l());
    }

    public lfp f(int i1)
    {
        return a(lcz.j(), i1, 2);
    }

    public lfp g()
    {
        return b(lcz.l());
    }

    public lfp g(int i1)
    {
        return a(lcz.l(), i1, 1);
    }

    public lfp h()
    {
        return a(lcz.r());
    }

    public lfp h(int i1)
    {
        return a(lcz.m(), i1, 2);
    }

    public lfp i()
    {
        return b(lcz.r());
    }

    public lfp i(int i1)
    {
        return a(lcz.n(), i1, 3);
    }

    public lfp j()
    {
        return a(lcz.w());
    }

    public lfp j(int i1)
    {
        return a(lcz.o(), i1, 2);
    }

    public lfp k()
    {
        return a(new lga(0, null), ((lge) (null)));
    }

    public lfp k(int i1)
    {
        return a(lcz.r(), i1, 2);
    }

    public lfp l()
    {
        lga lga1 = new lga(1, null);
        return a(lga1, lga1);
    }

    public lfp m()
    {
        return a(lfz.a, lfz.a);
    }
}
