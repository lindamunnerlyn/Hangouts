// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;

final class fom
    implements fqo
{

    final foj a;
    private final int b;
    private boolean c;
    private ArrayList d;
    private ArrayList e;
    private ArrayList f;
    private fqt g;
    private final boolean h;

    public fom(foj foj1, int i1)
    {
        a = foj1;
        super();
        b = i1;
        boolean flag;
        if (!TextUtils.isEmpty(e()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }

    private static Iterable a(fqt fqt1)
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(fqt1);
        return arraylist;
    }

    private String a(Cursor cursor, fon fon1)
    {
        int i1 = foj.e(a).getInt(4);
        if (i1 == 0)
        {
            return cursor.getString(5);
        } else
        {
            return fon1.a(i1);
        }
    }

    private String a(String s)
    {
        if (f())
        {
            int i1 = foj.a(a).a(b, 0);
            return foj.d(a).b(s, i1, foj.d(a).a(i1));
        } else
        {
            return null;
        }
    }

    private int k()
    {
        return foj.b(a).b(b);
    }

    private void l()
    {
        if (!c)
        {
            c = true;
            int j1 = k();
            d = new ArrayList(j1);
            e = new ArrayList();
            f = null;
            if (f() && foj.g(a))
            {
                f = foj.h(a).a(a("v_phones"), false);
            }
            if (f == null)
            {
                f = new ArrayList();
            }
            g = null;
            String s = e();
            int i1 = 0;
            while (i1 < j1) 
            {
                int k1 = foj.b(a).a(b, i1);
                if (foj.e(a).moveToPosition(k1))
                {
                    long l1 = foj.e(a).getLong(0);
                    d.add(Long.valueOf(l1));
                    do
                    {
                        Object obj = foj.e(a).getString(2);
                        if ("vnd.android.cursor.item/email_v2".equals(obj) && g == null)
                        {
                            obj = a(foj.e(a), foj.i(a));
                            String s1 = foj.e(a).getString(3);
                            if (!TextUtils.isEmpty(s1))
                            {
                                obj = new foq(((String) (obj)), s1);
                                if (!e.contains(obj))
                                {
                                    if (s != null && foj.j(a).containsKey(((fqt) (obj)).b()) && s.equals(foj.j(a).get(((fqt) (obj)).b())))
                                    {
                                        g = ((fqt) (obj));
                                        e.clear();
                                    } else
                                    {
                                        e.add(obj);
                                    }
                                }
                            }
                        } else
                        if ("vnd.android.cursor.item/phone_v2".equals(obj))
                        {
                            Object obj1 = a(foj.e(a), foj.k(a));
                            String s2 = foj.e(a).getString(3);
                            if (!TextUtils.isEmpty(s2))
                            {
                                obj1 = new foz(((String) (obj1)), s2);
                                if (!f.contains(obj1))
                                {
                                    f.add(obj1);
                                }
                            }
                        }
                    } while (foo.b(foj.e(a)));
                }
                i1++;
            }
        }
    }

    public String a()
    {
        foj.c(a);
        if (f())
        {
            return a("name");
        } else
        {
            foj.e(a).moveToPosition(foj.b(a).a(b, 0));
            return foj.e(a).getString(1);
        }
    }

    public Iterable b()
    {
        foj.c(a);
        l();
        return d;
    }

    public Iterable c()
    {
        foj.c(a);
        String s = fqa.d(g());
        if (!TextUtils.isEmpty(s))
        {
            return a(new foq("", s));
        }
        l();
        if (h)
        {
            if (g != null)
            {
                return a(g);
            } else
            {
                return fqt.a;
            }
        }
        foj.c(a);
        boolean flag;
        if (k() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            if (g.m(3))
            {
                (new StringBuilder("Row should have a contact: ")).append(g());
                g.m(3);
            }
            return fqt.a;
        } else
        {
            return e;
        }
    }

    public Iterable d()
    {
        foj.c(a);
        if (fqa.e(g()))
        {
            return fqz.a;
        } else
        {
            l();
            return f;
        }
    }

    public String e()
    {
        foj.c(a);
        return (String)foj.f(a).get(b);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof fom)
        {
            obj = (fom)obj;
            flag = flag1;
            if (b == ((fom) (obj)).b)
            {
                flag = flag1;
                if (a == ((fom) (obj)).a)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public boolean f()
    {
        foj.c(a);
        return foj.a(a).b(b) > 0;
    }

    public String g()
    {
        foj.c(a);
        return a("qualified_id");
    }

    public String h()
    {
        foj.c(a);
        return fpn.a.a(a("avatar"));
    }

    public int hashCode()
    {
        return a.hashCode() * 31 + b;
    }

    public String[] i()
    {
        foj.c(a);
        return fqa.b(a("v_circle_ids"));
    }

    public String j()
    {
        foj.c(a);
        if (f())
        {
            return foj.d(a).f().getString("account");
        } else
        {
            return null;
        }
    }
}
