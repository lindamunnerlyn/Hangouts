// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

public final class zi
{

    private SparseArray a;
    private SparseIntArray b;
    private int c;

    public zi()
    {
        a = new SparseArray();
        b = new SparseIntArray();
        c = 0;
    }

    public zq a(int i)
    {
        ArrayList arraylist = (ArrayList)a.get(i);
        if (arraylist != null && !arraylist.isEmpty())
        {
            i = arraylist.size() - 1;
            zq zq1 = (zq)arraylist.get(i);
            arraylist.remove(i);
            return zq1;
        } else
        {
            return null;
        }
    }

    void a(yx yx, yx yx1, boolean flag)
    {
        if (yx != null)
        {
            c = c - 1;
        }
        if (!flag && c == 0)
        {
            a.clear();
        }
        if (yx1 != null)
        {
            c = c + 1;
        }
    }

    public void a(zq zq1)
    {
        int i = zq1.e;
        ArrayList arraylist1 = (ArrayList)a.get(i);
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            ArrayList arraylist2 = new ArrayList();
            a.put(i, arraylist2);
            arraylist = arraylist2;
            if (b.indexOfKey(i) < 0)
            {
                b.put(i, 5);
                arraylist = arraylist2;
            }
        }
        if (b.get(i) <= arraylist.size())
        {
            return;
        } else
        {
            zq1.t();
            arraylist.add(zq1);
            return;
        }
    }
}
