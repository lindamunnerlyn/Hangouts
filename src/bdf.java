// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class bdf extends ay
{

    int a;
    final bdc b;
    private ArrayList c;
    private ad d;

    public bdf(bdc bdc1, ap ap, ad ad1)
    {
        b = bdc1;
        super(ap);
        c = new ArrayList();
        a = 0;
        d = ad1;
        ap = bdc1.d();
        for (int i = 0; i < bdc1.a.size(); i++)
        {
            ad1 = (cwv)bdc1.a.get(i);
            bdi bdi1 = new bdi(this);
            bdi1.a = i;
            bdi1.e = ((cwv) (ad1)).c.b;
            bdi1.d = ((cwv) (ad1)).c.a;
            bdi1.f = ((cwv) (ad1)).c.c;
            bdi1.c = ((cwv) (ad1)).a;
            bdi1.b = ((cwv) (ad1)).b;
            c.add(bdi1);
            if (bdi1.c.equals(ap))
            {
                a = i;
            }
        }

    }

    public ad a(int i)
    {
        bcq bcq1 = new bcq();
        Bundle bundle = new Bundle();
        bundle.putString("album_id", ((cwv)b.a.get(i)).a);
        bcq1.setArguments(bundle);
        return bcq1;
    }

    public Object a(ViewGroup viewgroup, int i)
    {
        viewgroup = (ad)super.a(viewgroup, i);
        viewgroup.setTargetFragment(d, 5);
        return viewgroup;
    }

    void a(bdi bdi1)
    {
        if (b.isAdded() && bdc.a(b) != null)
        {
            View view = bdc.a(b).a(bdi1.a);
            if (view != null)
            {
                view.setContentDescription(bdb.a(b.getResources(), bdi1.c));
                ImageView imageview = (ImageView)view.findViewById(h.hA);
                if (bdi1.g != null && bdi1.g.b != null)
                {
                    imageview.setImageBitmap(bdi1.g.b.e());
                    imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                } else
                if (bdi1.g != null && bdi1.g.a != null)
                {
                    imageview.setImageDrawable(bdi1.g.a);
                    imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                    bdi1.g.a.a();
                } else
                if ("Recent".equals(bdi1.c))
                {
                    imageview.setImageResource(g.lt);
                    imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER);
                } else
                {
                    String s = String.valueOf(bdi1.c);
                    if (s.length() != 0)
                    {
                        s = "No cache item set:".concat(s);
                    } else
                    {
                        s = new String("No cache item set:");
                    }
                    gbh.a(s);
                }
                imageview.setAlpha(0.0F);
                imageview.animate().alpha(1.0F).setDuration(250L).start();
                ((TextView)view.findViewById(h.hB)).setText(bdi1.b);
                return;
            }
        }
    }

    public int b()
    {
        return c.size();
    }

    public CharSequence c(int i)
    {
        if (c.size() >= i)
        {
            return ((bdi)c.get(i)).b;
        } else
        {
            return "";
        }
    }

    public void e()
    {
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bdi bdi1 = (bdi)iterator.next();
            if (bdi1.g != null)
            {
                bdi1.g.a();
                bdi1.g = null;
            }
        } while (true);
        c = new ArrayList();
    }

    public void f()
    {
        do
        {
            for (Iterator iterator = c.iterator(); iterator.hasNext();)
            {
                bdi bdi1 = (bdi)iterator.next();
                if ("Recent".equals(bdi1.c))
                {
                    a(bdi1);
                } else
                {
                    eam eam1 = (new eam(bdi1.e, null)).a(b.getResources().getInteger(g.lu));
                    eam1.b(bdi1.d);
                    if (bdc.d(b).get(bdi1.d) != null)
                    {
                        Object obj = String.valueOf(bdi1.d);
                        if (((String) (obj)).length() != 0)
                        {
                            obj = "Canceling previous request for ".concat(((String) (obj)));
                        } else
                        {
                            obj = new String("Canceling previous request for ");
                        }
                        ebw.e("StickersPagerFragment", ((String) (obj)));
                        bdc.e(b).b((dlt)bdc.d(b).get(bdi1.d));
                        bdc.d(b).remove(bdi1.d);
                    }
                    obj = new ara(bdc.f(b).a(), eam1, bdi1.f, new bdg(this, bdi1), this);
                    bdc.d(b).put(bdi1.d, obj);
                    bdc.e(b).a(((dlt) (obj)));
                }
            }

            return;
        } while (true);
    }
}
