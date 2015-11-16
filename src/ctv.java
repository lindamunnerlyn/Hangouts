// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public final class ctv
    implements Serializable
{

    private final String a;
    private final int b;
    private Boolean c;
    private Long d;
    private Float e;
    private boolean f;
    private boolean g;
    private long h;
    private float i;

    public ctv(izk izk1)
    {
        boolean flag = true;
        super();
        f = false;
        a = izk1.a;
        int j = g.a(izk1.b, 0);
        if (j == 1)
        {
            b = 1;
            g = g.a(izk1.c.d, false);
        } else
        if (j == 2)
        {
            b = 2;
            h = g.a(izk1.c.a, 0L);
        } else
        if (j == 3)
        {
            b = 3;
            i = (float)g.a(izk1.c.b);
        } else
        {
            eev.g("Babel", String.format("Invalid server experiment type %s for %s", new Object[] {
                Integer.valueOf(j), toString()
            }));
            b = -1;
        }
        if (g.a(izk1.d, 0) != 2)
        {
            flag = false;
        }
        f = flag;
    }

    public ctv(String s)
    {
        f = false;
        a = s;
        e = Float.valueOf(1.08F);
        b = 3;
    }

    public ctv(String s, long l)
    {
        f = false;
        a = s;
        d = Long.valueOf(l);
        b = 2;
    }

    public ctv(String s, boolean flag)
    {
        f = false;
        a = s;
        c = Boolean.valueOf(flag);
        b = 1;
    }

    private static grd d(int j)
    {
        return ((gqz)hlp.a(g.nU, gqz)).b(j);
    }

    private static Boolean d()
    {
        for (Iterator iterator = hlp.c(g.nU, dcy).iterator(); iterator.hasNext();)
        {
            dcy dcy1 = (dcy)iterator.next();
            if (dcy1.a())
            {
                return Boolean.valueOf(dcy1.b());
            }
        }

        return null;
    }

    private static Long e()
    {
        for (Iterator iterator = hlp.c(g.nU, dcy).iterator(); iterator.hasNext();)
        {
            dcy dcy1 = (dcy)iterator.next();
            if (dcy1.a())
            {
                return Long.valueOf(dcy1.c());
            }
        }

        return null;
    }

    private static Float f()
    {
        for (Iterator iterator = hlp.c(g.nU, dcy).iterator(); iterator.hasNext();)
        {
            dcy dcy1 = (dcy)iterator.next();
            if (dcy1.a())
            {
                return Float.valueOf(dcy1.d());
            }
        }

        return null;
    }

    public int a()
    {
        boolean flag1 = true;
        int j = b;
        String s = (new StringBuilder(36)).append("Invalid experiment type. ").append(j).toString();
        boolean flag = flag1;
        if (b != 1)
        {
            flag = flag1;
            if (b != 2)
            {
                if (b == 3)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
        }
        gdv.a(s, flag);
        return b;
    }

    public void a(grd grd1, ctv ctv1)
    {
        gdv.a(ctv1.b(), b());
        gdv.a(Integer.valueOf(ctv1.a()), Integer.valueOf(a()));
        if (ctv1.a() == 1)
        {
            grd1.g("babel_exp").b(a, ctv1.g);
        } else
        {
            if (ctv1.a() == 2)
            {
                grd1.g("babel_exp").b(a, ctv1.h);
                return;
            }
            if (ctv1.a() == 3)
            {
                grd1.g("babel_exp").b(a, ctv1.i);
                return;
            }
        }
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public boolean a(int j)
    {
        gdv.b("Expected non-null", c);
        boolean flag = g.a(c, false);
        if (!((gqz)hlp.a(g.nU, gqz)).c(j))
        {
            eev.f("Babel", (new StringBuilder(54)).append("Invalid account getting boolean experiment ").append(j).toString());
            return flag;
        }
        Boolean boolean1 = d();
        if (boolean1 != null)
        {
            return g.a(boolean1, false);
        } else
        {
            return d(j).i("babel_exp").a(a, flag);
        }
    }

    public long b(int j)
    {
        gdv.b("Expected non-null", d);
        long l = g.a(d, 0L);
        if (!((gqz)hlp.a(g.nU, gqz)).c(j))
        {
            eev.f("Babel", (new StringBuilder(51)).append("Invalid account getting long experiment ").append(j).toString());
            return l;
        }
        Long long1 = e();
        if (long1 != null)
        {
            return g.a(long1, 0L);
        } else
        {
            return d(j).i("babel_exp").a(a, l);
        }
    }

    public String b()
    {
        return a;
    }

    public float c(int j)
    {
        gdv.b("Expected non-null", e);
        float f1 = g.a(e);
        if (!((gqz)hlp.a(g.nU, gqz)).c(j))
        {
            eev.f("Babel", (new StringBuilder(52)).append("Invalid account getting float experiment ").append(j).toString());
            return f1;
        }
        Float float1 = f();
        if (float1 != null)
        {
            return g.a(float1);
        } else
        {
            return d(j).i("babel_exp").a(a, f1);
        }
    }

    public boolean c()
    {
        return f;
    }

    public String toString()
    {
        String s = String.valueOf("BabelExperiment{id='");
        String s1 = a;
        int j = b;
        String s2 = String.valueOf(c);
        String s3 = String.valueOf(d);
        String s4 = String.valueOf(e);
        return (new StringBuilder(String.valueOf(s).length() + 76 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s).append(s1).append("', experimentType=").append(j).append(", defaultBoolean=").append(s2).append(", defaultLong=").append(s3).append(", defaultFloat=").append(s4).append("}").toString();
    }
}
