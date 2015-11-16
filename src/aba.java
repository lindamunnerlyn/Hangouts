// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.HashMap;

public abstract class aba extends abb
{

    public Context a;
    public Cursor b;
    public int c;
    public SparseIntArray d;
    public final HashMap e = new HashMap();

    public aba(Context context, ap ap, Cursor cursor)
    {
        super(ap);
        int i;
        if (cursor != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        b = cursor;
        a = context;
        if (i != 0)
        {
            i = b.getColumnIndex("uri");
        } else
        {
            i = -1;
        }
        c = i;
    }

    private boolean b(int i)
    {
        if (b != null && !b.isClosed())
        {
            return b.moveToPosition(i);
        } else
        {
            return false;
        }
    }

    private void f()
    {
        if (b == null || b.isClosed())
        {
            d = null;
            return;
        }
        SparseIntArray sparseintarray = new SparseIntArray(b.getCount());
        b.moveToPosition(-1);
        for (; b.moveToNext(); sparseintarray.append(b.getString(c).hashCode(), b.getPosition())) { }
        d = sparseintarray;
    }

    public ad a(int i)
    {
        if (b != null && b(i))
        {
            return a(b, i);
        } else
        {
            return null;
        }
    }

    public abstract ad a(Cursor cursor, int i);

    public Cursor a(Cursor cursor)
    {
        if (Log.isLoggable("BaseCursorPagerAdapter", 2))
        {
            int i;
            int j;
            if (b == null)
            {
                i = -1;
            } else
            {
                i = b.getCount();
            }
            if (cursor == null)
            {
                j = -1;
            } else
            {
                j = cursor.getCount();
            }
            (new StringBuilder(43)).append("swapCursor old=").append(i).append("; new=").append(j);
        }
        if (cursor == b)
        {
            return null;
        }
        Cursor cursor1 = b;
        b = cursor;
        if (cursor != null)
        {
            c = cursor.getColumnIndex("uri");
        } else
        {
            c = -1;
        }
        f();
        d();
        return cursor1;
    }

    public Object a(View view, int i)
    {
        if (b == null)
        {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        Integer integer;
        if (b(i))
        {
            integer = Integer.valueOf(b.getString(c).hashCode());
        } else
        {
            integer = null;
        }
        view = ((View) (super.a(view, i)));
        if (view != null)
        {
            e.put(view, integer);
        }
        return view;
    }

    protected String a(int i, int j)
    {
        if (b(j))
        {
            j = b.getString(c).hashCode();
            return (new StringBuilder(37)).append("android:pager:").append(i).append(":").append(j).toString();
        } else
        {
            return super.a(i, j);
        }
    }

    public void a(View view, int i, Object obj)
    {
        e.remove(obj);
        super.a(view, i, obj);
    }

    public int b()
    {
        if (b != null)
        {
            return b.getCount();
        } else
        {
            return 0;
        }
    }

    public int c(Object obj)
    {
        obj = (Integer)e.get(obj);
        if (obj == null || d == null)
        {
            return -2;
        } else
        {
            return d.get(((Integer) (obj)).intValue(), -2);
        }
    }

    public Cursor e()
    {
        return b;
    }
}
