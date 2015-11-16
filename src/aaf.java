// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class aaf extends BaseAdapter
{

    private final Context a;
    private ArrayList b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;

    public aaf(Context context)
    {
        this(context, (byte)0);
    }

    private aaf(Context context, byte byte0)
    {
        c = 0;
        d = true;
        e = true;
        a = context;
        b = new ArrayList();
    }

    public aag a(int i)
    {
        return (aag)b.get(i);
    }

    protected View a(int i, Cursor cursor, View view)
    {
        if (view == null)
        {
            view = a(a);
        }
        a(view, i, cursor);
        return view;
    }

    public abstract View a(Context context);

    protected View a(View view)
    {
        if (view != null)
        {
            return view;
        } else
        {
            return null;
        }
    }

    protected void a()
    {
        d = false;
    }

    public void a(int i, Cursor cursor)
    {
        Cursor cursor1 = ((aag)b.get(i)).c;
        if (cursor1 != cursor)
        {
            if (cursor1 != null && !cursor1.isClosed())
            {
                cursor1.close();
            }
            ((aag)b.get(i)).c = cursor;
            if (cursor != null)
            {
                ((aag)b.get(i)).d = cursor.getColumnIndex("_id");
            }
            a();
            notifyDataSetChanged();
        }
    }

    public void a(aag aag1)
    {
        b.add(aag1);
        a();
        notifyDataSetChanged();
    }

    public abstract void a(View view, int i, Cursor cursor);

    public boolean areAllItemsEnabled()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((aag)iterator.next()).b)
            {
                return false;
            }
        }

        return true;
    }

    public int b()
    {
        return b.size();
    }

    public Cursor b(int i)
    {
        return ((aag)b.get(i)).c;
    }

    protected void c()
    {
        if (d)
        {
            return;
        }
        c = 0;
        Iterator iterator = b.iterator();
        while (iterator.hasNext()) 
        {
label0:
            {
                aag aag1 = (aag)iterator.next();
                Cursor cursor = aag1.c;
                int i;
                int j;
                if (cursor == null || cursor.isClosed())
                {
                    i = 0;
                } else
                {
                    i = cursor.getCount();
                }
                j = i;
                if (!aag1.b)
                {
                    break label0;
                }
                if (i == 0)
                {
                    j = i;
                    if (!aag1.a)
                    {
                        break label0;
                    }
                }
                j = i + 1;
            }
            aag1.e = j;
            c = c + j;
        }
        d = true;
    }

    public int getCount()
    {
        c();
        return c;
    }

    public Object getItem(int i)
    {
        Object obj;
        int j;
        c();
        obj = b.iterator();
        j = 0;
_L6:
        Object obj1;
        int k;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (aag)((Iterator) (obj)).next();
        k = ((aag) (obj1)).e + j;
        if (i < j || i >= k)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        j = i - j;
        i = j;
        if (((aag) (obj1)).b)
        {
            i = j - 1;
        }
        if (i != -1) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return obj;
_L2:
        obj1 = ((aag) (obj1)).c;
        if (obj1 == null || ((Cursor) (obj1)).isClosed())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (((Cursor) (obj1)).moveToPosition(i)) goto _L4; else goto _L3
_L3:
        return null;
        j = k;
        if (true) goto _L6; else goto _L5
_L5:
        return null;
    }

    public long getItemId(int i)
    {
        c();
        Iterator iterator = b.iterator();
        int k;
        for (int j = 0; iterator.hasNext(); j = k)
        {
            aag aag1 = (aag)iterator.next();
            k = aag1.e + j;
            if (i >= j && i < k)
            {
                j = i - j;
                i = j;
                if (aag1.b)
                {
                    i = j - 1;
                }
                if (i == -1)
                {
                    return 0L;
                }
                if (aag1.d == -1)
                {
                    return 0L;
                }
                Cursor cursor = aag1.c;
                if (cursor == null || cursor.isClosed() || !cursor.moveToPosition(i))
                {
                    return 0L;
                } else
                {
                    return cursor.getLong(aag1.d);
                }
            }
        }

        return 0L;
    }

    public int getItemViewType(int i)
    {
        c();
        int i1 = b.size();
        int j = 0;
        int l;
        for (int k = 0; j < i1; k = l)
        {
            l = k + ((aag)b.get(j)).e;
            if (i >= k && i < l)
            {
                i -= k;
                if (((aag)b.get(j)).b)
                {
                    i--;
                }
                return i != -1 ? 1 : -1;
            }
            j++;
        }

        throw new ArrayIndexOutOfBoundsException(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        c();
        int i1 = b.size();
        int j = 0;
        int k = 0;
        while (j < i1) 
        {
            int l = k + ((aag)b.get(j)).e;
            if (i >= k && i < l)
            {
                k = i - k;
                i = k;
                if (((aag)b.get(j)).b)
                {
                    i = k - 1;
                }
                if (i == -1)
                {
                    b.get(j);
                    view = a(view);
                } else
                {
                    if (!((aag)b.get(j)).c.moveToPosition(i))
                    {
                        throw new IllegalStateException((new StringBuilder(44)).append("Couldn't move cursor to position ").append(i).toString());
                    }
                    view = a(j, ((aag)b.get(j)).c, view);
                }
                if (view == null)
                {
                    throw new NullPointerException((new StringBuilder(69)).append("View should not be null, partition: ").append(j).append(" position: ").append(i).toString());
                } else
                {
                    return view;
                }
            }
            j++;
            k = l;
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isEnabled(int i)
    {
        c();
        int i1 = b.size();
        int j = 0;
        int l;
        for (int k = 0; j < i1; k = l)
        {
            l = k + ((aag)b.get(j)).e;
            if (i >= k && i < l)
            {
                return !((aag)b.get(j)).b || i - k != 0;
            }
            j++;
        }

        return false;
    }

    public void notifyDataSetChanged()
    {
        if (e)
        {
            f = false;
            super.notifyDataSetChanged();
            return;
        } else
        {
            f = true;
            return;
        }
    }
}
