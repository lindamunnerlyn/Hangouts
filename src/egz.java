// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class egz extends edn
{

    ehq j;
    final egx k;
    private String l;
    private Uri m;
    private egy n;
    private long o;

    public egz(egx egx1, Context context, String s, Uri uri, ftc ftc, long l1, 
            egy egy1)
    {
        k = egx1;
        super(context);
        n = egy1;
        j = new ehq(ftc);
        l = s;
        m = uri;
        j.a(s);
        o = l1;
    }

    public void a(int i1)
    {
    }

    public void a(int i1, int j1, int k1)
    {
    }

    public void a(Cursor cursor, int i1, Map map)
    {
        boolean flag1 = true;
        ani ani1 = dbf.e(i1);
        a(cursor, dbf.e(i1), false, l);
        map = k.a(i1, l, 0, map);
        j.a(map);
        j.e(cursor.getString(48));
        int j1 = s();
        ArrayList arraylist;
        boolean flag;
        if (r() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(j1);
        map = j;
        if (g.e(s()))
        {
            if (flag && drk.c())
            {
                j1 = eho.c;
            } else
            {
                j1 = eho.b;
            }
        } else
        {
            j1 = eho.a;
        }
        map.a(j1);
        j.a(t());
        j.a(q());
        j.b(flag);
        map = j;
        if (cursor.getInt(47) == 1)
        {
            flag1 = false;
        }
        map.c(flag1);
        cursor = l;
        cursor = (new aoe(k.a, i1)).J(cursor);
        arraylist = new ArrayList();
        if (!flag)
        {
            Iterator iterator = cursor.iterator();
            Map map1 = null;
            cursor = null;
            while (iterator.hasNext()) 
            {
                map = (ceu)iterator.next();
                if (ani1.b().a(((ceu) (map)).b))
                {
                    cursor = map;
                } else
                {
                    map1 = map;
                }
            }
            if (map1 != null)
            {
                if (cursor != null && !TextUtils.isEmpty(((ceu) (map1)).f) && !((ceu) (map1)).f.equals(((ceu) (cursor)).f))
                {
                    map = ((ceu) (map1)).f;
                } else
                {
                    map = ((ceu) (map1)).e;
                }
                cursor = map;
                if (ani1.m())
                {
                    cursor = map;
                    if (!((ceu) (map1)).y)
                    {
                        arraylist.add(map);
                        cursor = map;
                    }
                }
            } else
            {
                cursor = null;
            }
            map = cursor;
            if (TextUtils.isEmpty(cursor))
            {
                map = j.a();
            }
            j.d(map);
        } else
        if (ani1.m())
        {
            map = cursor.iterator();
            while (map.hasNext()) 
            {
                cursor = (ceu)map.next();
                if (!((ceu) (cursor)).y && ani1.m() && !ani1.b().a(((ceu) (cursor)).b))
                {
                    if (((ceu) (cursor)).f != null)
                    {
                        cursor = ((ceu) (cursor)).f;
                    } else
                    {
                        cursor = ((ceu) (cursor)).e;
                    }
                    if (!TextUtils.isEmpty(cursor))
                    {
                        arraylist.add(cursor);
                    }
                }
            }
        }
        j.b(arraylist);
    }

    public void a(Bitmap bitmap)
    {
    }

    public void a(CharSequence charsequence)
    {
        if (charsequence != null)
        {
            j.c(charsequence.toString());
        }
    }

    public void a(boolean flag)
    {
    }

    public void a(boolean flag, Bitmap bitmap, boolean flag1, Object obj)
    {
        if (obj != null && obj.equals(l) && !flag1)
        {
            n.a(m, bitmap);
        }
    }

    public CharSequence b()
    {
        return null;
    }

    public void b(int i1)
    {
    }

    public void b(Drawable drawable)
    {
    }

    public void b(CharSequence charsequence)
    {
    }

    public void b(String s)
    {
        if (s != null && s.length() > 1)
        {
            s = s.substring(1);
            j.b(s);
        }
    }

    public CharSequence c()
    {
        return null;
    }

    public void c(int i1)
    {
    }

    public void c(CharSequence charsequence)
    {
    }

    public TextView d()
    {
        return null;
    }

    public void d(int i1)
    {
    }

    public void d(CharSequence charsequence)
    {
    }

    public int e()
    {
        return 0;
    }

    public void e(int i1)
    {
    }

    public CharSequence f()
    {
        return null;
    }

    public void f(int i1)
    {
    }

    public CharSequence g()
    {
        return null;
    }

    public void g(int i1)
    {
    }

    public int h()
    {
        return 0;
    }

    public void h(int i1)
    {
    }

    public int i()
    {
        return 0;
    }

    public void i(int i1)
    {
    }

    public int j()
    {
        return 0;
    }

    public void j(int i1)
    {
    }

    protected void k()
    {
    }

    public void k(int i1)
    {
    }

    public void l(int i1)
    {
    }

    public boolean l()
    {
        return false;
    }

    public void m(int i1)
    {
    }

    public boolean m()
    {
        return t() > o;
    }

    public void n(int i1)
    {
    }
}
