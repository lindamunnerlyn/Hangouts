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

public final class bdv extends ay
{

    int a;
    final bds b;
    private ArrayList c;
    private ad d;

    public bdv(bds bds1, ap ap, ad ad1)
    {
        b = bds1;
        super(ap);
        c = new ArrayList();
        a = 0;
        d = ad1;
        ap = bds1.d();
        for (int i = 0; i < bds1.a.size(); i++)
        {
            ad1 = (cyz)bds1.a.get(i);
            bdy bdy1 = new bdy(this);
            bdy1.a = i;
            bdy1.e = ((cyz) (ad1)).c.b;
            bdy1.d = ((cyz) (ad1)).c.a;
            bdy1.f = ((cyz) (ad1)).c.c;
            bdy1.c = ((cyz) (ad1)).a;
            bdy1.b = ((cyz) (ad1)).b;
            c.add(bdy1);
            if (bdy1.c.equals(ap))
            {
                a = i;
            }
        }

    }

    public ad a(int i)
    {
        bdg bdg1 = new bdg();
        Bundle bundle = new Bundle();
        bundle.putString("album_id", ((cyz)b.a.get(i)).a);
        bdg1.setArguments(bundle);
        return bdg1;
    }

    public Object a(ViewGroup viewgroup, int i)
    {
        viewgroup = (ad)super.a(viewgroup, i);
        viewgroup.setTargetFragment(d, 5);
        return viewgroup;
    }

    void a(bdy bdy1)
    {
        if (b.isAdded() && bds.a(b) != null)
        {
            View view = bds.a(b).a(bdy1.a);
            if (view != null)
            {
                view.setContentDescription(bdr.a(b.getResources(), bdy1.c));
                ImageView imageview = (ImageView)view.findViewById(h.hg);
                if (bdy1.g != null && bdy1.g.b != null)
                {
                    imageview.setImageBitmap(bdy1.g.b.e());
                    imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                } else
                if (bdy1.g != null && bdy1.g.a != null)
                {
                    imageview.setImageDrawable(bdy1.g.a);
                    imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                    bdy1.g.a.a();
                } else
                if ("Recent".equals(bdy1.c))
                {
                    imageview.setImageResource(g.ll);
                    imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER);
                } else
                {
                    String s = String.valueOf(bdy1.c);
                    if (s.length() != 0)
                    {
                        s = "No cache item set:".concat(s);
                    } else
                    {
                        s = new String("No cache item set:");
                    }
                    gdv.a(s);
                }
                imageview.setAlpha(0.0F);
                imageview.animate().alpha(1.0F).setDuration(250L).start();
                ((TextView)view.findViewById(h.hh)).setText(bdy1.b);
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
            return ((bdy)c.get(i)).b;
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
            bdy bdy1 = (bdy)iterator.next();
            if (bdy1.g != null)
            {
                bdy1.g.a();
                bdy1.g = null;
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
                bdy bdy1 = (bdy)iterator.next();
                if ("Recent".equals(bdy1.c))
                {
                    a(bdy1);
                } else
                {
                    edq edq1 = (new edq(bdy1.e, null)).a(b.getResources().getInteger(g.lm));
                    edq1.b(bdy1.d);
                    if (bds.d(b).get(bdy1.d) != null)
                    {
                        Object obj = String.valueOf(bdy1.d);
                        if (((String) (obj)).length() != 0)
                        {
                            obj = "Canceling previous request for ".concat(((String) (obj)));
                        } else
                        {
                            obj = new String("Canceling previous request for ");
                        }
                        eev.e("StickersPagerFragment", ((String) (obj)));
                        bds.e(b).b((dor)bds.d(b).get(bdy1.d));
                        bds.d(b).remove(bdy1.d);
                    }
                    obj = new arr(bds.f(b).a(), edq1, bdy1.f, new bdw(this, bdy1), this);
                    bds.d(b).put(bdy1.d, obj);
                    bds.e(b).a(((dor) (obj)));
                }
            }

            return;
        } while (true);
    }
}
