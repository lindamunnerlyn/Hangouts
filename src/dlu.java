// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.database.AbstractCursor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class dlu extends AbstractCursor
    implements bgz
{

    private static final String c[] = {
        "_id", "aggregated_person"
    };
    private fqp a;
    private ArrayList b;

    public dlu(fqp fqp1)
    {
        b = new ArrayList();
        if (ActivityManager.isUserAMonkey())
        {
            return;
        } else
        {
            a = fqp1;
            g();
            return;
        }
    }

    private int a(int i)
    {
        return ((dlv)b.get(i)).a;
    }

    private void g()
    {
        HashSet hashset = new HashSet();
        b.clear();
        if (a != null)
        {
            for (int i = 0; i < a.a(); i++)
            {
                fqo fqo1 = (fqo)a.a(i);
                Iterator iterator = fqo1.d().iterator();
                for (int j = 0; iterator.hasNext(); j++)
                {
                    Object obj = (fqz)iterator.next();
                    String s = String.valueOf(fqo1.a());
                    obj = String.valueOf(((fqz) (obj)).b());
                    s = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(obj).length())).append(s).append(":").append(((String) (obj))).toString();
                    if (!hashset.contains(s))
                    {
                        hashset.add(s);
                        b.add(new dlv(i, j));
                    }
                }

            }

        }
    }

    public fqo a()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return (fqo)a.a(a(getPosition()));
        }
    }

    public void a(bgl bgl)
    {
        throw new UnsupportedOperationException();
    }

    public bhj b()
    {
        return null;
    }

    public bhb c()
    {
        Object obj = a();
        if (obj != null)
        {
            int j = ((dlv)b.get(getPosition())).b;
            obj = ((fqo) (obj)).d().iterator();
            for (int i = 0; ((Iterator) (obj)).hasNext(); i++)
            {
                fqz fqz1 = (fqz)((Iterator) (obj)).next();
                if (i == j)
                {
                    return new bhb(null, fqz1.b(), 0L, 0, null, true);
                }
            }

        }
        return null;
    }

    public int d()
    {
        return 1;
    }

    public int e()
    {
        return 0;
    }

    public boolean f()
    {
        return ((dlv)b.get(getPosition())).b == 0;
    }

    public String[] getColumnNames()
    {
        return c;
    }

    public int getCount()
    {
        return b.size();
    }

    public double getDouble(int i)
    {
        throw new UnsupportedOperationException();
    }

    public float getFloat(int i)
    {
        throw new UnsupportedOperationException();
    }

    public int getInt(int i)
    {
        throw new UnsupportedOperationException();
    }

    public long getLong(int i)
    {
        if (i == 0)
        {
            return (long)a(getPosition());
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public short getShort(int i)
    {
        throw new UnsupportedOperationException();
    }

    public String getString(int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean isNull(int i)
    {
        return false;
    }

}
