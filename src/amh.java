// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class amh extends amf
    implements Serializable
{

    private String b;
    private String c;
    private List d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private List l;
    private List m;

    amh(String s, String s1, List list, String s2, String s3, boolean flag, boolean flag1, 
            boolean flag2, boolean flag3, boolean flag4, List list1, List list2)
    {
        d = new ArrayList();
        b = s;
        c = s1;
        d = list;
        e = s2;
        f = s3;
        g = flag;
        h = flag1;
        i = flag2;
        j = flag3;
        k = flag4;
        l = list1;
        m = list2;
    }

    public static amh a(ceu ceu1, List list, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (ceu1.A != null)
        {
            for (Iterator iterator = ceu1.A.iterator(); iterator.hasNext(); arraylist.add(new aml((String)iterator.next()))) { }
        }
        ArrayList arraylist1 = new ArrayList();
        if (list != null)
        {
            for (list = list.iterator(); list.hasNext(); arraylist1.add(new aml((String)list.next()))) { }
        }
        list = new ArrayList();
        if (ceu1.B != null)
        {
            for (Iterator iterator1 = ceu1.B.iterator(); iterator1.hasNext(); list.add(new amd((String)iterator1.next()))) { }
        }
        ami ami1 = new ami();
        ami ami2 = ami1.b(ceu1.h).a(g.a(ceu1, false)).a(new ame(ceu1.b(), ceu1.h()));
        if (flag || ceu1.z)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ami2.a(flag).c(arraylist).c(arraylist1).b(list);
        if (!TextUtils.isEmpty(ceu1.c))
        {
            ami1.f(ceu1.c);
        }
        return ami1.b();
    }

    public aml a()
    {
        boolean flag;
        if (m != null && !m.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return (aml)m.get(0);
        } else
        {
            return null;
        }
    }

    public Collection b()
    {
        if (m != null)
        {
            return Collections.unmodifiableList(m);
        } else
        {
            return Collections.emptyList();
        }
    }

    public String c()
    {
        boolean flag;
        if (l != null && !l.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return ((amd)l.get(0)).b();
        } else
        {
            return null;
        }
    }

    public Collection d()
    {
        if (l != null)
        {
            return Collections.unmodifiableList(l);
        } else
        {
            return Collections.emptyList();
        }
    }

    public String e()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (amh)obj;
        if (d == null ? ((amh) (obj)).d != null : !d.equals(((amh) (obj)).d))
        {
            return false;
        }
        if (l == null ? ((amh) (obj)).l != null : !l.equals(((amh) (obj)).l))
        {
            return false;
        }
        if (m == null) goto _L4; else goto _L3
_L3:
        if (m.equals(((amh) (obj)).m)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((amh) (obj)).m == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public String f()
    {
        return c;
    }

    public boolean g()
    {
        return h;
    }

    public boolean h()
    {
        return !d.isEmpty();
    }

    public int hashCode()
    {
        int k1 = 0;
        int i1;
        int j1;
        if (d != null)
        {
            i1 = d.hashCode();
        } else
        {
            i1 = 0;
        }
        if (l != null)
        {
            j1 = l.hashCode();
        } else
        {
            j1 = 0;
        }
        if (m != null)
        {
            k1 = m.hashCode();
        }
        return (j1 + i1 * 31) * 31 + k1;
    }

    public String i()
    {
        if (d.isEmpty())
        {
            return null;
        } else
        {
            return ((ame)d.get(0)).a();
        }
    }

    public Collection j()
    {
        return Collections.unmodifiableList(d);
    }

    public String k()
    {
        return e;
    }

    public boolean l()
    {
        return !TextUtils.isEmpty(m());
    }

    public String m()
    {
        return f;
    }

    public boolean n()
    {
        return g;
    }

    public boolean o()
    {
        return k;
    }
}
