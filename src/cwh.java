// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cwh extends cwm
{

    private static final int j[] = {
        1
    };
    private static final long serialVersionUID = 1L;
    public List a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public cwh(List list, String s, boolean flag, boolean flag1)
    {
        a = list;
        d = flag;
        b = s;
        c = flag1;
    }

    private void q()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dbi dbi1 = (dbi)iterator.next();
            if (dbi1 != null)
            {
                arraylist.add(dbi1);
            }
        } while (true);
        a = arraylist;
    }

    public kws a(String s, int i, int k)
    {
        boolean flag = false;
        if (cvv.e)
        {
            String s1 = String.valueOf(a);
            eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 34)).append("GetEntityByIdRequest: lookupSpecs=").append(s1).toString());
        }
        izx izx1 = new izx();
        izx1.requestHeader = cvu.a(null, true, s, i, k, h);
        izx1.b = j;
        s = a.iterator();
        i = 0;
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            if ((dbi)s.next() != null)
            {
                i++;
            }
        } while (true);
        if (i > 0)
        {
            izx1.a = new iyy[i];
        }
        if (i < a.size())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        s = a.iterator();
        k = i;
        i = ((flag) ? 1 : 0);
        while (s.hasNext()) 
        {
            dbi dbi1 = (dbi)s.next();
            if (dbi1 == null)
            {
                eev.g("Babel_RequestWriter", "GetEntityByIdRequest: null spec!");
                k = 1;
            } else
            {
                izx1.a[i] = dbi1.d();
                i++;
            }
        }
        if (k != 0)
        {
            q();
        }
        return izx1;
    }

    public void a(aoa aoa1, dcx dcx)
    {
        if (c)
        {
            Object obj = dih.b(aoa1.h());
            if (((dih) (obj)).d() == 2)
            {
                dcx = String.valueOf(eev.b(aoa1.a()));
                if (dcx.length() != 0)
                {
                    dcx = "RefreshParticipantsOperation failed: ".concat(dcx);
                } else
                {
                    dcx = new String("RefreshParticipantsOperation failed: ");
                }
                eev.f("Babel_RequestWriter", dcx);
                ((dih) (obj)).a(0);
            }
        }
        if (!d)
        {
            for (dcx = a.iterator(); dcx.hasNext(); dny.a(aoa1).a(((dbi) (obj))))
            {
                obj = (dbi)dcx.next();
            }

        }
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return !d && super.a(cdn, dcx);
    }

    public long b()
    {
        if (d)
        {
            return 0L;
        } else
        {
            return super.b();
        }
    }

    public String f()
    {
        return "contacts/getentitybyid";
    }

}
