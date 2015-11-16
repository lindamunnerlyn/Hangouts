// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class lpz
{

    private ArrayList a;
    private Object b;

    public lpz()
    {
        a = new ArrayList();
    }

    private lpz a(Object obj)
    {
        b = null;
        a.add(obj);
        a.add(obj);
        return this;
    }

    private lpz a(lnj lnj1)
    {
        if (lnj1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        } else
        {
            return a(new lqi(lnj1, false));
        }
    }

    private lpz a(lnj lnj1, int i1, int j1)
    {
        if (lnj1 == null)
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
            return a(new lqn(lnj1, k1, false));
        } else
        {
            return a(new lqg(lnj1, k1, false, i1));
        }
    }

    private lpz a(lqs lqs1, lqo lqo1)
    {
        b = null;
        a.add(lqs1);
        a.add(lqo1);
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

    private lpz b(lnj lnj1)
    {
        if (lnj1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        } else
        {
            return a(new lqi(lnj1, true));
        }
    }

    private lpz b(lnj lnj1, int i1, int j1)
    {
        if (lnj1 == null)
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
            return a(new lqn(lnj1, k1, true));
        } else
        {
            return a(new lqg(lnj1, k1, true, i1));
        }
    }

    private static boolean b(Object obj)
    {
        if (obj instanceof lqo)
        {
            if (obj instanceof lqb)
            {
                return ((lqb)obj).d();
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

    private lpz c(lnj lnj1, int i1, int j1)
    {
        if (lnj1 == null)
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
            return a(new lqd(lnj1, i1, k1));
        }
    }

    private static void c(lqo lqo1)
    {
        if (lqo1 == null)
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
            obj2 = new lqb(a);
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

    public lpy a()
    {
        Object obj = n();
        lqs lqs1;
        boolean flag;
        if (obj instanceof lqs)
        {
            if (obj instanceof lqb)
            {
                flag = ((lqb)obj).c();
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
            lqs1 = (lqs)obj;
        } else
        {
            lqs1 = null;
        }
        if (b(obj))
        {
            obj = (lqo)obj;
        } else
        {
            obj = null;
        }
        if (lqs1 != null || obj != null)
        {
            return new lpy(lqs1, ((lqo) (obj)));
        } else
        {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
    }

    public lpz a(char c1)
    {
        return a(new lqa(c1));
    }

    public lpz a(int i1)
    {
        return a(lnj.c(), i1, 2);
    }

    public lpz a(int i1, int j1)
    {
        return c(lnj.d(), i1, j1);
    }

    public lpz a(int i1, boolean flag)
    {
        return a(new lqm(lnj.s(), i1, flag));
    }

    public lpz a(String s)
    {
        lpz lpz1 = this;
        switch (s.length())
        {
        default:
            lpz1 = a(new lqh(s));
            // fall through

        case 0: // '\0'
            return lpz1;

        case 1: // '\001'
            return a(new lqa(s.charAt(0)));
        }
    }

    public lpz a(String s, boolean flag)
    {
        return a(new lql(null, s, flag, 2, 2));
    }

    public lpz a(String s, boolean flag, int i1)
    {
        return a(new lql(s, s, flag, 2, i1));
    }

    public lpz a(lnj lnj1, int i1)
    {
        if (lnj1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i1 <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder(37)).append("Illegal number of digits: ").append(i1).toString());
        } else
        {
            return a(new lqc(lnj1, i1));
        }
    }

    public lpz a(lpy lpy1)
    {
        if (lpy1 == null)
        {
            throw new IllegalArgumentException("No formatter supplied");
        } else
        {
            return a(lpy1.a(), lpy1.b());
        }
    }

    public lpz a(lqo lqo1)
    {
        c(lqo1);
        return a(((lqs) (null)), lqo1);
    }

    public lpz a(lqo alqo[])
    {
        int i1 = 0;
        int j1 = alqo.length;
        if (j1 == 1)
        {
            if (alqo[0] == null)
            {
                throw new IllegalArgumentException("No parser supplied");
            } else
            {
                return a(((lqs) (null)), alqo[0]);
            }
        }
        lqo alqo1[] = new lqo[j1];
        for (; i1 < j1 - 1; i1++)
        {
            lqo lqo1 = alqo[i1];
            alqo1[i1] = lqo1;
            if (lqo1 == null)
            {
                throw new IllegalArgumentException("Incomplete parser array");
            }
        }

        alqo1[i1] = alqo[i1];
        return a(((lqs) (null)), ((lqo) (new lqe(alqo1))));
    }

    public lpz b(int i1)
    {
        return a(lnj.e(), i1, 2);
    }

    public lpz b(int i1, int j1)
    {
        return b(lnj.p(), i1, j1);
    }

    public lpz b(int i1, boolean flag)
    {
        return a(new lqm(lnj.p(), i1, flag));
    }

    public lpz b(lqo lqo1)
    {
        c(lqo1);
        return a(((lqs) (null)), new lqe(new lqo[] {
            lqo1, null
        }));
    }

    public lqo b()
    {
        Object obj = n();
        if (b(obj))
        {
            return (lqo)obj;
        } else
        {
            throw new UnsupportedOperationException("Parsing is not supported");
        }
    }

    public lpz c()
    {
        return c(lnj.f(), 1, 9);
    }

    public lpz c(int i1)
    {
        return a(lnj.g(), i1, 2);
    }

    public lpz c(int i1, int j1)
    {
        return b(lnj.s(), i1, j1);
    }

    public lpz d()
    {
        return c(lnj.g(), 1, 9);
    }

    public lpz d(int i1)
    {
        return a(lnj.h(), i1, 2);
    }

    public lpz d(int i1, int j1)
    {
        return a(lnj.t(), i1, j1);
    }

    public lpz e()
    {
        return a(lnj.k());
    }

    public lpz e(int i1)
    {
        return a(lnj.i(), i1, 2);
    }

    public lpz e(int i1, int j1)
    {
        return b(lnj.v(), i1, j1);
    }

    public lpz f()
    {
        return a(lnj.l());
    }

    public lpz f(int i1)
    {
        return a(lnj.j(), i1, 2);
    }

    public lpz g()
    {
        return b(lnj.l());
    }

    public lpz g(int i1)
    {
        return a(lnj.l(), i1, 1);
    }

    public lpz h()
    {
        return a(lnj.r());
    }

    public lpz h(int i1)
    {
        return a(lnj.m(), i1, 2);
    }

    public lpz i()
    {
        return b(lnj.r());
    }

    public lpz i(int i1)
    {
        return a(lnj.n(), i1, 3);
    }

    public lpz j()
    {
        return a(lnj.w());
    }

    public lpz j(int i1)
    {
        return a(lnj.o(), i1, 2);
    }

    public lpz k()
    {
        return a(new lqk(0, null), ((lqo) (null)));
    }

    public lpz k(int i1)
    {
        return a(lnj.r(), i1, 2);
    }

    public lpz l()
    {
        lqk lqk1 = new lqk(1, null);
        return a(lqk1, lqk1);
    }

    public lpz m()
    {
        return a(lqj.a, lqj.a);
    }
}
