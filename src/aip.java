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

public final class aip
    implements Serializable
{

    private final List a;
    private final Map b;
    private final List c;
    private final Map d;
    private String e;
    private transient List f;

    public aip()
    {
        a = new ArrayList();
        b = new HashMap();
        c = new ArrayList();
        d = new HashMap();
        e = "";
        f = new ArrayList();
    }

    public aip(aik aik1, boolean flag)
    {
        if (aik1 != null)
        {
            aik1 = aik1.a();
        } else
        {
            aik1 = Collections.EMPTY_LIST;
        }
        this(((Collection) (aik1)), flag);
    }

    private aip(Collection collection, boolean flag)
    {
        a = new ArrayList();
        b = new HashMap();
        c = new ArrayList();
        d = new HashMap();
        e = "";
        f = new ArrayList();
        if (flag)
        {
            c.addAll(collection);
            ais ais1;
            for (collection = collection.iterator(); collection.hasNext(); d.put(ais1.b(), ais1))
            {
                ais1 = (ais)collection.next();
            }

        } else
        {
            a.addAll(collection);
            ais ais2;
            for (collection = collection.iterator(); collection.hasNext(); b.put(ais2.b(), ais2))
            {
                ais2 = (ais)collection.next();
            }

        }
    }

    static List a(aip aip1)
    {
        return aip1.f;
    }

    private boolean a(daf daf1)
    {
        return d.containsKey(daf1) || b.containsKey(daf1);
    }

    private void h()
    {
        g.a(new aiq(this));
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        f = new ArrayList();
    }

    public aik a()
    {
        return aik.newBuilder().a(c).a(a).a();
    }

    public void a(air air1)
    {
        f.add(air1);
    }

    public void a(ais ais1)
    {
        if (d.containsKey(ais1.b()) || b.containsKey(ais1.b()))
        {
            return;
        } else
        {
            a.add(ais1);
            b.put(ais1.b(), ais1);
            h();
            return;
        }
    }

    public void a(amf amf1)
    {
        n.b(c(amf1), "Person has already been removed from the model.");
        amf1 = amf1.p().iterator();
        do
        {
            if (!amf1.hasNext())
            {
                break;
            }
            daf daf1 = (daf)amf1.next();
            if (a(daf1))
            {
                b((ais)b.get(daf1));
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
        if (!TextUtils.equals(e, s1))
        {
            e = s1;
            for (s = f.iterator(); s.hasNext(); ((air)s.next()).a(e)) { }
        }
    }

    public int b()
    {
        return c.size() + a.size();
    }

    public void b(ais ais1)
    {
        n.b(a(ais1.b()), "Person has already been removed from the model.");
        a.remove(ais1);
        if (b.remove(ais1.b()) != null)
        {
            h();
        }
    }

    public boolean b(amf amf1)
    {
        for (amf1 = amf1.p().iterator(); amf1.hasNext();)
        {
            daf daf1 = (daf)amf1.next();
            if (d.containsKey(daf1))
            {
                return true;
            }
        }

        return false;
    }

    public List c()
    {
        return new ArrayList(a);
    }

    public boolean c(ais ais1)
    {
        return c.contains(ais1);
    }

    public boolean c(amf amf1)
    {
        for (amf1 = amf1.p().iterator(); amf1.hasNext();)
        {
            if (a((daf)amf1.next()))
            {
                return true;
            }
        }

        return false;
    }

    public List d()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(c);
        arraylist.addAll(a);
        return arraylist;
    }

    public int e()
    {
        return c.size() + a.size();
    }

    public void f()
    {
        a.clear();
        b.clear();
        h();
    }

    public String g()
    {
        return e;
    }
}
