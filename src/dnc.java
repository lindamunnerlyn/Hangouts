// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dnc extends dmy
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final String b;
    public final List f;
    public final List g;
    public final List h;
    public final String i;
    public final int j;
    public final int k;
    public final int l[];
    public final cgd m;
    public final dbb n;
    public final boolean o;
    public final int p;
    public final int q;
    public final long r;
    public long s;
    public final byte t[];
    public final int u;
    public final Boolean v;
    public final boolean w;
    public final List x;
    public cub y;

    public dnc(ixg ixg1)
    {
        super(ixg1.a.a, null, -1L);
        Object obj;
        ArrayList arraylist;
        int k1;
        try
        {
            obj = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            nosuchalgorithmexception = null;
        }
        if (obj != null)
        {
            ((MessageDigest) (obj)).update(ixg.toByteArray(ixg1));
            t = ((MessageDigest) (obj)).digest();
        } else
        {
            t = null;
        }
        a = g.a(ixg1.c, 0);
        b = ixg1.d;
        obj = ixg1.g;
        arraylist = new ArrayList();
        k1 = obj.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            arraylist.add(new dbb(obj[i1]));
        }

        g = arraylist;
        h = cty.a(ixg1.l);
        f = g.a(ixg1.k, ixg1.l);
        o = g.a(ixg1.h, false);
        p = g.a(ixg1.i, 0);
        q = g.a(ixg1.j, 1);
        if (ixg1.f != null)
        {
            ixh ixh1 = ixg1.f;
            Object obj1;
            if (g.a(ixh1.b, 0L) != 0L)
            {
                obj1 = aow.a(g.a(ixh1.b, 0L));
            } else
            {
                obj1 = null;
            }
            i = ((String) (obj1));
            j = g.a(ixh1.c, 0);
            k = g.a(ixh1.a, 0);
            if (ixh1.d.length > 0)
            {
                obj1 = ixh1.d;
            } else
            {
                obj1 = null;
            }
            l = ((int []) (obj1));
            m = g.a(ixh1.e, null);
            if (ixh1.g != null)
            {
                obj1 = new dbb(ixh1.g);
            } else
            {
                obj1 = null;
            }
            n = ((dbb) (obj1));
            r = g.a(ixh1.h, 0L);
            s = g.a(ixh1.j, 0L);
            u = g.a(ixh1.k, 0);
            if (g.a(ixh1.l, false))
            {
                obj1 = Boolean.FALSE;
            } else
            {
                obj1 = null;
            }
            v = ((Boolean) (obj1));
            w = g.a(ixg1.m, false);
            if (ixh1.m.length == 1)
            {
                x = null;
                y = new cub(ixh1.m[0].a);
                return;
            }
            if (ixh1.m.length > 1)
            {
                x = new ArrayList(ixh1.m.length);
                int j1 = 0;
                ixg1 = null;
                for (; j1 < ixh1.m.length; j1++)
                {
                    cub cub1 = new cub(ixh1.m[j1].a);
                    x.add(cub1);
                    if (ixg1 == null || g.a(ixh1.m[j1].b, false))
                    {
                        ixg1 = cub1;
                    }
                }

                y = ixg1;
                return;
            } else
            {
                x = null;
                y = null;
                return;
            }
        } else
        {
            i = null;
            j = 30;
            k = 2;
            l = null;
            m = null;
            n = null;
            r = 0L;
            s = 0L;
            u = 2;
            v = null;
            w = false;
            x = null;
            y = null;
            return;
        }
    }

    public dnc(ixg ixg1, byte byte0)
    {
        this(ixg1);
    }

    public void a(long l1)
    {
        s = l1;
    }

    public void a(String s1)
    {
        Object obj = h.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            if (TextUtils.isEmpty(((cty)((Iterator) (obj)).next()).b))
            {
                continue;
            }
            obj = new iyf();
            obj.a = Integer.valueOf(2);
            obj.b = new kbm();
            ((iyf) (obj)).b.a = s1;
            y = new cub(((iyf) (obj)));
            break;
        } while (true);
    }

    public boolean a()
    {
        return s > 0L;
    }

    public String toString()
    {
        String s1 = String.valueOf(c);
        String s2;
        int i1;
        if (s1.length() != 0)
        {
            s1 = "C[".concat(s1);
        } else
        {
            s1 = new String("C[");
        }
        s1 = String.valueOf(s1);
        s2 = i;
        s1 = String.valueOf((new StringBuilder(String.valueOf(s1).length() + 18 + String.valueOf(s2).length())).append(s1).append("; clientGenerated=").append(s2).toString());
        i1 = j;
        return String.valueOf((new StringBuilder(String.valueOf(s1).length() + 31)).append(s1).append("; notificationLevel=").append(i1).toString()).concat("]");
    }
}
