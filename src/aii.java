// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class aii
    implements Serializable
{

    transient List a;
    private final List b;
    private final Map c;
    private final List d;
    private final Map e;
    private String f;

    public aii()
    {
        b = new ArrayList();
        c = new HashMap();
        d = new ArrayList();
        e = new HashMap();
        f = "";
        a = new ArrayList();
    }

    public aii(aid aid1, boolean flag)
    {
        if (aid1 != null)
        {
            aid1 = aid1.a();
        } else
        {
            aid1 = Collections.EMPTY_LIST;
        }
        this(((Collection) (aid1)), flag);
    }

    private aii(Collection collection, boolean flag)
    {
        b = new ArrayList();
        c = new HashMap();
        d = new ArrayList();
        e = new HashMap();
        f = "";
        a = new ArrayList();
        if (flag)
        {
            d.addAll(collection);
            ail ail1;
            for (collection = collection.iterator(); collection.hasNext(); e.put(ail1.b(), ail1))
            {
                ail1 = (ail)collection.next();
            }

        } else
        {
            b.addAll(collection);
            ail ail2;
            for (collection = collection.iterator(); collection.hasNext(); c.put(ail2.b(), ail2))
            {
                ail2 = (ail)collection.next();
            }

        }
    }

    private boolean a(dbl dbl1)
    {
        return e.containsKey(dbl1) || c.containsKey(dbl1);
    }

    private void h()
    {
        g.a(new aij(this));
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        a = new ArrayList();
    }

    public aid a()
    {
        return aid.newBuilder().a(d).a(b).a();
    }

    public void a(aik aik1)
    {
        a.add(aik1);
    }

    public void a(ail ail1)
    {
        if (e.containsKey(ail1.b()) || c.containsKey(ail1.b()))
        {
            return;
        } else
        {
            b.add(ail1);
            c.put(ail1.b(), ail1);
            h();
            return;
        }
    }

    public void a(amx amx1)
    {
        n.b(c(amx1), "Person has already been removed from the model.");
        amx1 = amx1.p().iterator();
        do
        {
            if (!amx1.hasNext())
            {
                break;
            }
            dbl dbl1 = (dbl)amx1.next();
            if (a(dbl1))
            {
                b((ail)c.get(dbl1));
            }
        } while (true);
    }

    public void a(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        if (!TextUtils.equals(f, s1))
        {
            f = s1;
            for (s = a.iterator(); s.hasNext(); ((aik)s.next()).a(f)) { }
        }
    }

    public int b()
    {
        return d.size() + b.size();
    }

    public void b(ail ail1)
    {
        n.b(a(ail1.b()), "Person has already been removed from the model.");
        b.remove(ail1);
        if (c.remove(ail1.b()) != null)
        {
            h();
        }
    }

    public boolean b(amx amx1)
    {
        for (amx1 = amx1.p().iterator(); amx1.hasNext();)
        {
            dbl dbl1 = (dbl)amx1.next();
            if (e.containsKey(dbl1))
            {
                return true;
            }
        }

        return false;
    }

    public List c()
    {
        return new ArrayList(b);
    }

    public boolean c(ail ail1)
    {
        return d.contains(ail1);
    }

    public boolean c(amx amx1)
    {
        for (amx1 = amx1.p().iterator(); amx1.hasNext();)
        {
            if (a((dbl)amx1.next()))
            {
                return true;
            }
        }

        return false;
    }

    public List d()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(d);
        arraylist.addAll(b);
        return arraylist;
    }

    public int e()
    {
        return d.size() + b.size();
    }

    public void f()
    {
        b.clear();
        c.clear();
        h();
    }

    public String g()
    {
        return f;
    }
}
