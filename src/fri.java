// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;

final class fri
    implements fth
{

    final frf a;
    private final int b;
    private boolean c;
    private ArrayList d;
    private ArrayList e;
    private ArrayList f;
    private ftk g;
    private final boolean h;

    public fri(frf frf1, int i1)
    {
        a = frf1;
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

    private static Iterable a(ftk ftk1)
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(ftk1);
        return arraylist;
    }

    private String a(Cursor cursor, frj frj1)
    {
        int i1 = a.c.getInt(4);
        if (i1 == 0)
        {
            return cursor.getString(5);
        } else
        {
            return frj1.a(i1);
        }
    }

    private String a(String s)
    {
        if (f())
        {
            int i1 = a.d.a(b, 0);
            return a.b.b(s, i1, a.b.a(i1));
        } else
        {
            return null;
        }
    }

    private int k()
    {
        return a.e.b(b);
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
            if (f() && a.j)
            {
                f = a.k.a(a("v_phones"), false);
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
                int k1 = a.e.a(b, i1);
                if (a.c.moveToPosition(k1))
                {
                    long l1 = a.c.getLong(0);
                    d.add(Long.valueOf(l1));
                    do
                    {
                        Object obj = a.c.getString(2);
                        if ("vnd.android.cursor.item/email_v2".equals(obj) && g == null)
                        {
                            obj = a(a.c, a.h);
                            String s1 = a.c.getString(3);
                            if (!TextUtils.isEmpty(s1))
                            {
                                obj = new frm(((String) (obj)), s1);
                                if (!e.contains(obj))
                                {
                                    if (s != null && a.g.containsKey(((ftk) (obj)).b()) && s.equals(a.g.get(((ftk) (obj)).b())))
                                    {
                                        g = ((ftk) (obj));
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
                            Object obj1 = a(a.c, a.i);
                            String s2 = a.c.getString(3);
                            if (!TextUtils.isEmpty(s2))
                            {
                                obj1 = new frv(((String) (obj1)), s2);
                                if (!f.contains(obj1))
                                {
                                    f.add(obj1);
                                }
                            }
                        }
                    } while (frk.b(a.c));
                }
                i1++;
            }
        }
    }

    public String a()
    {
        a.e();
        if (f())
        {
            return a("name");
        } else
        {
            a.c.moveToPosition(a.e.a(b, 0));
            return a.c.getString(1);
        }
    }

    public Iterable b()
    {
        a.e();
        l();
        return d;
    }

    public Iterable c()
    {
        a.e();
        String s = fst.d(g());
        if (!TextUtils.isEmpty(s))
        {
            return a(new frm("", s));
        }
        l();
        if (h)
        {
            if (g != null)
            {
                return a(g);
            } else
            {
                return ftk.a;
            }
        }
        a.e();
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
            return ftk.a;
        } else
        {
            return e;
        }
    }

    public Iterable d()
    {
        a.e();
        if (fst.e(g()))
        {
            return ftq.a;
        } else
        {
            l();
            return f;
        }
    }

    public String e()
    {
        a.e();
        return (String)a.f.get(b);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof fri)
        {
            obj = (fri)obj;
            flag = flag1;
            if (b == ((fri) (obj)).b)
            {
                flag = flag1;
                if (a == ((fri) (obj)).a)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public boolean f()
    {
        a.e();
        return a.d.b(b) > 0;
    }

    public String g()
    {
        a.e();
        return a("qualified_id");
    }

    public String h()
    {
        a.e();
        return fsi.a.a(a("avatar"));
    }

    public int hashCode()
    {
        return a.hashCode() * 31 + b;
    }

    public String[] i()
    {
        a.e();
        return fst.b(a("v_circle_ids"));
    }

    public String j()
    {
        a.e();
        if (f())
        {
            return a.b.c().getString("account");
        } else
        {
            return null;
        }
    }
}
