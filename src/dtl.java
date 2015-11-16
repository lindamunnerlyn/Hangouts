// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dtl extends dtj
{

    public static final String a[] = {
        "_id", "msg_box", "sub", "sub_cs", "m_size", "date", "thread_id", "pri", "st", "read", 
        "seen"
    };
    public static final int b = 0;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    private static int x;
    private int A;
    private int B;
    private String C;
    private String D;
    private String E;
    private boolean F;
    public long m;
    public int n;
    public String o;
    public int p;
    public long q;
    public long r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public List w;
    private long y;
    private boolean z;

    public dtl()
    {
        w = new ArrayList();
        z = false;
        A = 0;
        B = 0;
        C = null;
        D = null;
        E = null;
        F = false;
    }

    public static dtl a(Cursor cursor)
    {
        boolean flag1 = true;
        dtl dtl1 = new dtl();
        dtl1.m = cursor.getLong(b);
        dtl1.n = cursor.getInt(c);
        dtl1.o = cursor.getString(d);
        dtl1.p = cursor.getInt(e);
        if (!TextUtils.isEmpty(dtl1.o))
        {
            dtl1.o = g.a(g.b(dtl1.o, 4), dtl1.p);
        }
        dtl1.y = cursor.getLong(f);
        dtl1.q = cursor.getLong(g) * 1000L * 1000L;
        dtl1.r = cursor.getLong(h);
        dtl1.s = cursor.getInt(i);
        dtl1.t = cursor.getInt(j);
        boolean flag;
        if (cursor.getInt(k) == 0)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        dtl1.u = flag;
        flag = flag1;
        if (cursor.getInt(l) == 0)
        {
            flag = false;
        }
        dtl1.v = flag;
        dtl1.w.clear();
        dtl1.z = false;
        dtl1.A = 0;
        dtl1.B = 0;
        dtl1.C = null;
        dtl1.D = null;
        dtl1.E = null;
        dtl1.F = false;
        return dtl1;
    }

    private void m()
    {
        if (!z)
        {
            z = true;
            Iterator iterator = w.iterator();
            long l2 = 0L;
            int k1 = 0;
            int i1 = 0;
            StringBuilder stringbuilder1 = null;
            StringBuilder stringbuilder = null;
            while (iterator.hasNext()) 
            {
                dtm dtm1 = (dtm)iterator.next();
                StringBuilder stringbuilder4;
                StringBuilder stringbuilder5;
                int j1;
                int l1;
                if (dtm1.a())
                {
                    A = A + 1;
                    if (C == null)
                    {
                        C = dtm1.j;
                        stringbuilder5 = stringbuilder;
                        stringbuilder4 = stringbuilder1;
                        l1 = i1;
                        j1 = k1;
                    } else
                    {
                        StringBuilder stringbuilder2 = stringbuilder;
                        if (stringbuilder == null)
                        {
                            stringbuilder = new StringBuilder();
                            stringbuilder2 = stringbuilder;
                            if (!TextUtils.isEmpty(C))
                            {
                                stringbuilder.append(C);
                                stringbuilder2 = stringbuilder;
                            }
                        }
                        j1 = k1;
                        l1 = i1;
                        stringbuilder4 = stringbuilder1;
                        stringbuilder5 = stringbuilder2;
                        if (!TextUtils.isEmpty(dtm1.j))
                        {
                            if (stringbuilder2.length() > 0)
                            {
                                stringbuilder2.append(" ");
                            }
                            stringbuilder2.append(dtm1.j);
                            j1 = k1;
                            l1 = i1;
                            stringbuilder4 = stringbuilder1;
                            stringbuilder5 = stringbuilder2;
                        }
                    }
                } else
                {
                    j1 = k1;
                    l1 = i1;
                    stringbuilder4 = stringbuilder1;
                    stringbuilder5 = stringbuilder;
                    if (dtm1.b())
                    {
                        B = B + 1;
                        if (dtm1.c())
                        {
                            F = true;
                        }
                        if (D == null)
                        {
                            D = dtm1.d().toString();
                            E = dtm1.i;
                            l1 = dtm1.l;
                            j1 = dtm1.m;
                            stringbuilder4 = stringbuilder1;
                            stringbuilder5 = stringbuilder;
                        } else
                        {
                            StringBuilder stringbuilder3 = stringbuilder1;
                            if (stringbuilder1 == null)
                            {
                                stringbuilder3 = new StringBuilder();
                                stringbuilder3.append(g.a(new String[] {
                                    D, E, Integer.toString(i1), Integer.toString(k1)
                                }));
                            }
                            stringbuilder3.append('|').append(g.a(new String[] {
                                dtm1.d().toString(), dtm1.i, Integer.toString(dtm1.l), Integer.toString(dtm1.m)
                            }));
                            j1 = k1;
                            l1 = i1;
                            stringbuilder4 = stringbuilder3;
                            stringbuilder5 = stringbuilder;
                        }
                    }
                }
                l2 += dtm1.n;
                k1 = j1;
                i1 = l1;
                stringbuilder1 = stringbuilder4;
                stringbuilder = stringbuilder5;
            }
            if (B > 1)
            {
                E = "multipart/mixed";
            }
            if (stringbuilder != null)
            {
                C = stringbuilder.toString();
            }
            if (stringbuilder1 != null)
            {
                D = stringbuilder1.toString();
            }
            if (y <= 0L)
            {
                long l3;
                if (o != null)
                {
                    l3 = o.getBytes().length;
                } else
                {
                    l3 = 0L;
                }
                y = l3;
                y = y + l2;
                return;
            }
        }
    }

    public int a()
    {
        return 1;
    }

    public void a(dtm dtm1)
    {
        w.add(dtm1);
    }

    public long b()
    {
        return m;
    }

    public long c()
    {
        return q;
    }

    public List d()
    {
        return w;
    }

    public String e()
    {
        if (!z)
        {
            m();
        }
        if (C == null)
        {
            return "";
        } else
        {
            return C;
        }
    }

    public String f()
    {
        if (!z)
        {
            m();
        }
        return D;
    }

    public String g()
    {
        if (!z)
        {
            m();
        }
        return E;
    }

    public long h()
    {
        if (!z)
        {
            m();
        }
        return y;
    }

    public boolean i()
    {
        if (!z)
        {
            m();
        }
        return F;
    }

    public int j()
    {
        if (!z)
        {
            m();
        }
        return A;
    }

    public int k()
    {
        if (!z)
        {
            m();
        }
        return B;
    }

    public List l()
    {
        ArrayList arraylist = null;
        if (!z)
        {
            m();
        }
        if (B > 0)
        {
            arraylist = new ArrayList();
            Iterator iterator = w.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (dtm)iterator.next();
                if (((dtm) (obj)).b())
                {
                    String s1 = ((dtm) (obj)).d().toString();
                    int i1 = ((dtm) (obj)).l;
                    int j1 = ((dtm) (obj)).m;
                    obj = ((dtm) (obj)).i;
                    arraylist.add(new dms(new int[] {
                        0
                    }, null, s1, i1, j1, ((String) (obj)), 1));
                }
            } while (true);
        }
        return arraylist;
    }

    static 
    {
        x = 0;
        x = 1;
        int i1 = x;
        x = i1 + 1;
        c = i1;
        i1 = x;
        x = i1 + 1;
        d = i1;
        i1 = x;
        x = i1 + 1;
        e = i1;
        i1 = x;
        x = i1 + 1;
        f = i1;
        i1 = x;
        x = i1 + 1;
        g = i1;
        i1 = x;
        x = i1 + 1;
        h = i1;
        i1 = x;
        x = i1 + 1;
        i = i1;
        i1 = x;
        x = i1 + 1;
        j = i1;
        i1 = x;
        x = i1 + 1;
        k = i1;
        i1 = x;
        x = i1 + 1;
        l = i1;
    }
}
