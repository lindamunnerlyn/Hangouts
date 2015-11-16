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

final class bbq extends SimpleCursorAdapter
    implements android.widget.AdapterView.OnItemClickListener
{

    Context a;
    bbt b;
    private ayt c;
    private View d;
    private View e;
    private Runnable f;

    public bbq(Context context, bbt bbt1, View view, int i, Cursor cursor, String as[], int ai[])
    {
        super(context, i, cursor, as, ai, 2);
        d = view.findViewById(g.kW);
        e = view.findViewById(g.kR);
        a = context;
        b = bbt1;
        c = (ayt)hlp.a(context, ayt);
        a(c.g());
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
            Object obj = (ato)list.next();
            if (((ato) (obj)).c == atp.b || ((ato) (obj)).c == atp.c)
            {
                int i;
                int j;
                if (((ato) (obj)).c == atp.b)
                {
                    i = bbp.a;
                } else
                {
                    i = bbp.b;
                }
                j = i;
                if (((ato) (obj)).d != null)
                {
                    j = i;
                    if (((ato) (obj)).d.equals("image/gif"))
                    {
                        j = bbp.c;
                    }
                }
                obj = new bbo(((ato) (obj)).b, j);
                obj.d = true;
                arraylist.add(obj);
            }
        } while (true);
        b.a(arraylist);
        b(arraylist);
    }

    private void b(List list)
    {
        if (!list.isEmpty())
        {
            e.setVisibility(8);
            return;
        } else
        {
            e.setVisibility(0);
            return;
        }
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        if (d != null)
        {
            d.setVisibility(8);
        }
        context = (GalleryItemView)view.findViewById(g.kS);
        context.a(cursor, view, b);
        if (f != null)
        {
            view = f;
            g.x().removeCallbacks(view);
        }
        f = new bbr(this, cursor, context);
        g.a(f, 500L);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (GalleryItemView)view.findViewById(g.kS);
        view = b.b(adapterview.b());
        Object obj;
        boolean flag1;
        if (!((bbo) (view)).d)
        {
            boolean flag;
            if (b.b() >= 10)
            {
                ((dvi)hlp.a(a, dvi)).a((new dvh(a)).a(a.getResources().getQuantityString(g.lb, 10, new Object[] {
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
            bbo bbo1;
            atx atx1;
            if (flag1)
            {
                ((beb)hlp.a(a, beb)).b(i);
            } else
            {
                gdy.a(new bbs(this, ((String) (obj)), i));
            }
        }
        if (!((bbo) (view)).d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        view.d = flag1;
        adapterview.a(view, true);
        view = new ArrayList();
        obj = b.c();
        i = 0;
        while (i < ((List) (obj)).size()) 
        {
            bbo1 = (bbo)((List) (obj)).get(i);
            atx1 = new atx();
            if (bbo1.a())
            {
                adapterview = atp.b;
            } else
            {
                adapterview = atp.c;
            }
            atx1.c = adapterview;
            if (bbo1.b == bbp.c)
            {
                atx1.d = "image/gif";
            }
            atx1.b = bbo1.a;
            view.add(atx1);
            i++;
        }
        b(((List) (obj)));
        c.a(a, view, new ayv(((List) (obj))));
    }
}
