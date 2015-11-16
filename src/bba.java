// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SimpleCursorAdapter;
import com.google.android.apps.hangouts.conversation.v2.gallerypicker.impl.GalleryItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bba extends SimpleCursorAdapter
    implements android.widget.AdapterView.OnItemClickListener
{

    private Context a;
    private ayf b;
    private View c;
    private View d;
    private bbd e;
    private Runnable f;

    public bba(Context context, bbd bbd1, View view, int i, Cursor cursor, String as[], int ai[])
    {
        super(context, i, cursor, as, ai, 2);
        c = view.findViewById(g.le);
        d = view.findViewById(g.kZ);
        a = context;
        e = bbd1;
        b = (ayf)hgx.a(context, ayf);
        a(b.g());
    }

    static Context a(bba bba1)
    {
        return bba1.a;
    }

    static void a(bba bba1, Cursor cursor, GalleryItemView galleryitemview)
    {
        int j = cursor.getPosition();
        for (int i = j - 5; i < j + 5; i++)
        {
            if (i >= 0 && i < bba1.getCount() && i != j)
            {
                cursor.moveToPosition(i);
                bay bay1 = bba1.e.a(cursor);
                bba1.e.a(bay1.a, null, galleryitemview.c());
            }
        }

        cursor.moveToPosition(j);
    }

    private void a(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (asy)list.next();
            if (((asy) (obj)).c == asz.b || ((asy) (obj)).c == asz.c)
            {
                int i;
                int j;
                if (((asy) (obj)).c == asz.b)
                {
                    i = baz.a;
                } else
                {
                    i = baz.b;
                }
                j = i;
                if (((asy) (obj)).d != null)
                {
                    j = i;
                    if (((asy) (obj)).d.equals("image/gif"))
                    {
                        j = baz.c;
                    }
                }
                obj = new bay(((asy) (obj)).b, j);
                obj.d = true;
                arraylist.add(obj);
            }
        } while (true);
        e.a(arraylist);
        b(arraylist);
    }

    private void b(List list)
    {
        if (!list.isEmpty())
        {
            d.setVisibility(8);
            return;
        } else
        {
            d.setVisibility(0);
            return;
        }
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        if (c != null)
        {
            c.setVisibility(8);
        }
        context = (GalleryItemView)view.findViewById(g.la);
        context.a(cursor, view, e);
        if (f != null)
        {
            view = f;
            g.y().removeCallbacks(view);
        }
        f = new bbb(this, cursor, context);
        g.a(f, 500L);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (GalleryItemView)view.findViewById(g.la);
        view = e.b(adapterview.b());
        Object obj;
        boolean flag1;
        if (!((bay) (view)).d)
        {
            boolean flag;
            if (e.b() >= 10)
            {
                ((dsp)hgx.a(a, dsp)).a((new dso(a)).a(a.getResources().getQuantityString(g.lj, 10, new Object[] {
                    Integer.valueOf(10)
                })).a());
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return;
            }
            flag1 = view.a();
            obj = adapterview.b();
            bay bay1;
            atg atg1;
            if (flag1)
            {
                ((bdp)hgx.a(a, bdp)).b(i);
            } else
            {
                gbk.a(new bbc(this, ((String) (obj)), i));
            }
        }
        if (!((bay) (view)).d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        view.d = flag1;
        adapterview.a(view, true);
        view = new ArrayList();
        obj = e.c();
        i = 0;
        while (i < ((List) (obj)).size()) 
        {
            bay1 = (bay)((List) (obj)).get(i);
            atg1 = new atg();
            if (bay1.a())
            {
                adapterview = asz.b;
            } else
            {
                adapterview = asz.c;
            }
            atg1.c = adapterview;
            if (bay1.b == baz.c)
            {
                atg1.d = "image/gif";
            }
            atg1.b = bay1.a;
            view.add(atg1);
            i++;
        }
        b(((List) (obj)));
        b.a(a, view, new ayh(((List) (obj))));
    }
}
