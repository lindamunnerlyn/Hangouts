// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.List;

public class hiv extends hjm
{

    private hjr c;
    private hjr d;
    private hjr e;
    private hjr f;

    public hiv()
    {
    }

    public void a()
    {
        e = a(((hjr) (new hiy(this))));
    }

    public void a(Intent intent)
    {
        for (int i1 = 0; i1 < a.size(); i1++)
        {
            fsn fsn1 = (fsn)a.get(i1);
            if (fsn1 instanceof hiu)
            {
                ((hiu)fsn1).a(intent);
            }
        }

    }

    public void a(Bundle bundle)
    {
        c = a(((hjr) (new hiw(this, bundle))));
    }

    public boolean a(KeyEvent keyevent)
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < a.size())
                {
                    fsn fsn1 = (fsn)a.get(i1);
                    if (!(fsn1 instanceof him) || !((him)fsn1).a(keyevent))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    public void b()
    {
        b(e);
        super.b();
    }

    public void b(Bundle bundle)
    {
        d = a(new hix(this, bundle));
    }

    public void c()
    {
        b(d);
        b(c);
        super.c();
    }

    public void d()
    {
        f = a(new hiz(this));
    }

    public void e()
    {
        b(f);
        for (int i1 = 0; i1 < a.size(); i1++)
        {
            a.get(i1);
        }

    }

    public void f()
    {
        for (int i1 = 0; i1 < a.size(); i1++)
        {
            a.get(i1);
        }

    }

    public void g()
    {
        for (int i1 = 0; i1 < a.size(); i1++)
        {
            a.get(i1);
        }

    }

    public void h()
    {
        for (int i1 = 0; i1 < a.size(); i1++)
        {
            a.get(i1);
        }

    }

    public void i()
    {
        for (int i1 = 0; i1 < a.size(); i1++)
        {
            a.get(i1);
        }

    }

    public void j()
    {
        for (int i1 = 0; i1 < a.size(); i1++)
        {
            fsn fsn1 = (fsn)a.get(i1);
            if (fsn1 instanceof hio)
            {
                ((hio)fsn1).a();
            }
        }

    }

    public void k()
    {
        for (int i1 = 0; i1 < a.size(); i1++)
        {
            fsn fsn1 = (fsn)a.get(i1);
            if (fsn1 instanceof hin)
            {
                ((hin)fsn1).b();
            }
        }

    }

    public boolean l()
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < a.size())
                {
                    fsn fsn1 = (fsn)a.get(i1);
                    if (!(fsn1 instanceof hip) || !((hip)fsn1).a())
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    public boolean m()
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < a.size())
                {
                    fsn fsn1 = (fsn)a.get(i1);
                    if (!(fsn1 instanceof hiq) || !((hiq)fsn1).a())
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    public boolean n()
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < a.size())
                {
                    fsn fsn1 = (fsn)a.get(i1);
                    if (!(fsn1 instanceof hir) || !((hir)fsn1).a())
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }
}
