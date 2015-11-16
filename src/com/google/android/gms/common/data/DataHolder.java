// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import af;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import epf;
import epg;
import eph;
import g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class DataHolder
    implements SafeParcelable
{

    public static final eph CREATOR = new eph();
    private static final epg l = new epf(new String[0]);
    Bundle a;
    int b[];
    int c;
    boolean d;
    private final int e;
    private final String f[];
    private final CursorWindow g[];
    private final int h;
    private final Bundle i;
    private Object j;
    private boolean k;

    public DataHolder(int i1, String as[], CursorWindow acursorwindow[], int j1, Bundle bundle)
    {
        d = false;
        k = true;
        e = i1;
        f = as;
        g = acursorwindow;
        h = j1;
        i = bundle;
    }

    private DataHolder(epg epg1, int i1, Bundle bundle)
    {
        this(epg1.a, a(epg1), i1, null);
    }

    private DataHolder(String as[], CursorWindow acursorwindow[], int i1, Bundle bundle)
    {
        d = false;
        k = true;
        e = 1;
        f = (String[])g.d(as);
        g = (CursorWindow[])g.d(acursorwindow);
        h = i1;
        i = bundle;
        a();
    }

    private void a(String s, int i1)
    {
        if (a == null || !a.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder("No such column: ")).append(s).toString());
        }
        if (e())
        {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i1 < 0 || i1 >= c)
        {
            throw new CursorIndexOutOfBoundsException(i1, c);
        } else
        {
            return;
        }
    }

    private static CursorWindow[] a(epg epg1)
    {
        Object obj;
        ArrayList arraylist;
        ArrayList arraylist1;
        int i1;
        int j1;
        boolean flag;
        int l1;
        flag = false;
        if (epg1.a.length == 0)
        {
            return new CursorWindow[0];
        }
        arraylist1 = epg1.b;
        l1 = arraylist1.size();
        obj = new CursorWindow(false);
        arraylist = new ArrayList();
        arraylist.add(obj);
        ((CursorWindow) (obj)).setNumColumns(epg1.a.length);
        i1 = 0;
        j1 = 0;
_L4:
        CursorWindow cursorwindow;
        if (i1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        cursorwindow = ((CursorWindow) (obj));
        if (((CursorWindow) (obj)).allocRow())
        {
            break MISSING_BLOCK_LABEL_175;
        }
        (new StringBuilder("Allocating additional cursor window for large data set (row ")).append(i1).append(")");
        obj = new CursorWindow(false);
        ((CursorWindow) (obj)).setStartPosition(i1);
        ((CursorWindow) (obj)).setNumColumns(epg1.a.length);
        arraylist.add(obj);
        cursorwindow = ((CursorWindow) (obj));
        if (!((CursorWindow) (obj)).allocRow())
        {
            Log.e("DataHolder", "Unable to allocate row to hold data.");
            arraylist.remove(obj);
            return (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
        }
        obj = (Map)arraylist1.get(i1);
        int k1;
        k1 = 0;
        String s;
        Object obj1;
        long l2;
        for (boolean flag1 = true; k1 >= epg1.a.length || !flag1; k1++)
        {
            break MISSING_BLOCK_LABEL_527;
        }

        s = epg1.a[k1];
        obj1 = ((Map) (obj)).get(s);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        flag1 = cursorwindow.putNull(i1, k1);
        break MISSING_BLOCK_LABEL_662;
        if (obj1 instanceof String)
        {
            flag1 = cursorwindow.putString((String)obj1, i1, k1);
            break MISSING_BLOCK_LABEL_662;
        }
        if (obj1 instanceof Long)
        {
            flag1 = cursorwindow.putLong(((Long)obj1).longValue(), i1, k1);
            break MISSING_BLOCK_LABEL_662;
        }
        if (obj1 instanceof Integer)
        {
            flag1 = cursorwindow.putLong(((Integer)obj1).intValue(), i1, k1);
            break MISSING_BLOCK_LABEL_662;
        }
        if (!(obj1 instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_368;
        }
        if (((Boolean)obj1).booleanValue())
        {
            l2 = 1L;
        } else
        {
            l2 = 0L;
        }
        flag1 = cursorwindow.putLong(l2, i1, k1);
        break MISSING_BLOCK_LABEL_662;
        if (obj1 instanceof byte[])
        {
            flag1 = cursorwindow.putBlob((byte[])obj1, i1, k1);
            break MISSING_BLOCK_LABEL_662;
        }
        if (obj1 instanceof Double)
        {
            flag1 = cursorwindow.putDouble(((Double)obj1).doubleValue(), i1, k1);
            break MISSING_BLOCK_LABEL_662;
        }
        if (obj1 instanceof Float)
        {
            flag1 = cursorwindow.putDouble(((Float)obj1).floatValue(), i1, k1);
            break MISSING_BLOCK_LABEL_662;
        }
        try
        {
            throw new IllegalArgumentException((new StringBuilder("Unsupported object for column ")).append(s).append(": ").append(obj1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (epg epg1)
        {
            j1 = arraylist.size();
        }
        for (i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
        {
            ((CursorWindow)arraylist.get(i1)).close();
        }

        break MISSING_BLOCK_LABEL_645;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_631;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_547;
        }
        throw new af("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
        (new StringBuilder("Couldn't populate window data for row ")).append(i1).append(" - allocating new window.");
        cursorwindow.freeLastRow();
        cursorwindow = new CursorWindow(false);
        cursorwindow.setStartPosition(i1);
        cursorwindow.setNumColumns(epg1.a.length);
        arraylist.add(cursorwindow);
        j1 = i1 - 1;
        i1 = 1;
_L2:
        k1 = i1;
        i1 = j1 + 1;
        obj = cursorwindow;
        j1 = k1;
        continue; /* Loop/switch isn't completed */
        k1 = 0;
        j1 = i1;
        i1 = k1;
        if (true) goto _L2; else goto _L1
_L1:
        throw epg1;
        if (true) goto _L4; else goto _L3
_L3:
        return (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
    }

    public static DataHolder b(int i1)
    {
        return new DataHolder(l, i1, null);
    }

    private int g()
    {
        return e;
    }

    private String[] h()
    {
        return f;
    }

    private CursorWindow[] i()
    {
        return g;
    }

    public int a(int i1)
    {
        int k1 = 0;
        boolean flag;
        if (i1 >= 0 && i1 < c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag);
        do
        {
label0:
            {
                int j1 = k1;
                if (k1 < b.length)
                {
                    if (i1 >= b[k1])
                    {
                        break label0;
                    }
                    j1 = k1 - 1;
                }
                i1 = j1;
                if (j1 == b.length)
                {
                    i1 = j1 - 1;
                }
                return i1;
            }
            k1++;
        } while (true);
    }

    public int a(String s, int i1, int j1)
    {
        a(s, i1);
        return g[j1].getInt(i1, a.getInt(s));
    }

    public void a()
    {
        int k1 = 0;
        a = new Bundle();
        for (int i1 = 0; i1 < f.length; i1++)
        {
            a.putInt(f[i1], i1);
        }

        b = new int[g.length];
        boolean flag = false;
        int j1 = k1;
        k1 = ((flag) ? 1 : 0);
        for (; j1 < g.length; j1++)
        {
            b[j1] = k1;
            int l1 = g[j1].getStartPosition();
            k1 += g[j1].getNumRows() - (k1 - l1);
        }

        c = k1;
    }

    public void a(Object obj)
    {
        j = obj;
    }

    public int b()
    {
        return h;
    }

    public String b(String s, int i1, int j1)
    {
        a(s, i1);
        return g[j1].getString(i1, a.getInt(s));
    }

    public Bundle c()
    {
        return i;
    }

    public byte[] c(String s, int i1, int j1)
    {
        a(s, i1);
        return g[j1].getBlob(i1, a.getInt(s));
    }

    public int d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (d) goto _L2; else goto _L1
_L1:
        d = true;
        int i1 = 0;
_L3:
        if (i1 >= g.length)
        {
            break; /* Loop/switch isn't completed */
        }
        g[i1].close();
        i1++;
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void finalize()
    {
        if (!k || g.length <= 0 || e()) goto _L2; else goto _L1
_L1:
        String s;
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s = (new StringBuilder("internal object: ")).append(toString()).toString();
_L3:
        Log.e("DataBuffer", (new StringBuilder("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (")).append(s).append(")").toString());
        f();
_L2:
        super.finalize();
        return;
        s = j.toString();
          goto _L3
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        int j1 = g.p(parcel, 20293);
        g.a(parcel, 1, h());
        g.b(parcel, 1000, g());
        g.a(parcel, 2, i(), i1);
        g.b(parcel, 3, b());
        g.a(parcel, 4, c());
        g.q(parcel, j1);
    }

}
