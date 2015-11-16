// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class fdj extends fdo
{

    public fdk o;

    public fdj()
    {
    }

    protected int a()
    {
        int j = 0;
        int k;
        if (o != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= o.a())
                {
                    break;
                }
                i += o.b(j).a();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    public void a(fdi fdi)
    {
        if (o != null)
        {
            int i = 0;
            while (i < o.a()) 
            {
                o.b(i).a(fdi);
                i++;
            }
        }
    }

    protected final boolean a(fdh fdh1, int i)
    {
        int j = fdh1.m();
        if (!fdh1.b(i))
        {
            return false;
        }
        int k = fdq.b(i);
        fdp fdp1 = new fdp(i, fdh1.a(j, fdh1.m() - j));
        fdh1 = null;
        Object obj;
        if (o == null)
        {
            o = new fdk();
        } else
        {
            fdh1 = o.a(k);
        }
        obj = fdh1;
        if (fdh1 == null)
        {
            obj = new fdl();
            o.a(k, ((fdl) (obj)));
        }
        ((fdl) (obj)).a(fdp1);
        return true;
    }

    protected final boolean a(fdj fdj1)
    {
        if (o == null || o.b())
        {
            return fdj1.o == null || fdj1.o.b();
        } else
        {
            return o.equals(fdj1.o);
        }
    }

    protected final int c()
    {
        if (o == null || o.b())
        {
            return 0;
        } else
        {
            return o.hashCode();
        }
    }

    public Object clone()
    {
        return d();
    }

    public fdj d()
    {
        fdj fdj1 = (fdj)super.e();
        fdm.a(this, fdj1);
        return fdj1;
    }

    public fdo e()
    {
        return d();
    }
}
