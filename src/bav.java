// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.conversation.v2.TransportSpinner;

public final class bav extends ArrayAdapter
{

    public boolean a;
    final TransportSpinner b;
    private final LayoutInflater c;

    public bav(TransportSpinner transportspinner, Context context, int i)
    {
        b = transportspinner;
        super(context, i);
        c = LayoutInflater.from(context);
    }

    private static int a(int i)
    {
        if (i == 2)
        {
            return com.google.android.apps.hangouts.R.drawable.bz;
        } else
        {
            return com.google.android.apps.hangouts.R.drawable.by;
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = getItem(i);
        if (obj instanceof asa)
        {
            view = c.inflate(g.fm, viewgroup, false);
            obj = (asa)obj;
            int i1 = ((asa) (obj)).b;
            Object obj1 = (ImageView)view.findViewById(h.cC);
            Object obj2 = (TextView)view.findViewById(h.fG);
            Object obj3 = (TextView)view.findViewById(h.fX);
            viewgroup = (TextView)view.findViewById(h.fT);
            if (g.e(i1))
            {
                ((ImageView) (obj1)).setImageResource(0);
                ((TextView) (obj2)).setBackgroundResource(a(i1));
                int j;
                if (b.b)
                {
                    j = l.ga;
                } else
                {
                    j = l.ju;
                }
                ((TextView) (obj2)).setText(j);
                ((TextView) (obj2)).setVisibility(0);
                ((TextView) (obj3)).setText(eey.p(((asa) (obj)).c));
                ((TextView) (obj3)).setTextColor(b.getResources().getColor(g.dd));
                viewgroup.setVisibility(8);
                if (!TextUtils.isEmpty(((asa) (obj)).f) || a)
                {
                    obj1 = ((asa) (obj)).f;
                    viewgroup.setVisibility(0);
                    obj = new StringBuilder();
                    if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                    {
                        ((StringBuilder) (obj)).append(((String) (obj1)));
                        if (a)
                        {
                            ((StringBuilder) (obj)).append(" ");
                        }
                    }
                    if (a)
                    {
                        obj1 = ((StringBuilder) (obj)).append("(");
                        obj2 = b;
                        if (g.d(i1))
                        {
                            if (((TransportSpinner) (obj2)).b)
                            {
                                j = l.sG;
                            } else
                            {
                                j = l.sH;
                            }
                        } else
                        {
                            obj3 = dcn.e(((TransportSpinner) (obj2)).a);
                            if (obj3 != null && ((aoa) (obj3)).Y())
                            {
                                j = l.sI;
                            } else
                            {
                                j = l.sF;
                            }
                        }
                        ((StringBuilder) (obj1)).append(((TransportSpinner) (obj2)).getContext().getResources().getString(j)).append(")");
                    }
                    viewgroup.setText(((StringBuilder) (obj)).toString());
                }
                break MISSING_BLOCK_LABEL_324;
            } else
            {
                if (g.f(i1))
                {
                    TransportSpinner.a(b, ((ImageView) (obj1)));
                    ((TextView) (obj2)).setVisibility(8);
                    if (!TextUtils.isEmpty(((asa) (obj)).c))
                    {
                        viewgroup.setText(((asa) (obj)).c);
                    } else
                    {
                        viewgroup.setText(((asa) (obj)).d);
                    }
                    ((TextView) (obj3)).setText(b.getResources().getString(l.eC));
                }
                continue;
            }
        } else
        {
            if (obj instanceof baw)
            {
                obj = (baw)obj;
                view = c.inflate(g.fr, viewgroup, false);
                viewgroup = (TextView)view.findViewById(h.fX);
                ImageView imageview = (ImageView)view.findViewById(h.cC);
                viewgroup.setText(((baw) (obj)).a());
                int k = ((baw) (obj)).b();
                if (k == 0)
                {
                    imageview.setVisibility(8);
                } else
                {
                    imageview.setVisibility(0);
                    imageview.setImageResource(k);
                }
                if (obj instanceof android.view.View.OnClickListener)
                {
                    view.setOnClickListener((android.view.View.OnClickListener)obj);
                }
            } else
            {
                view = null;
            }
            continue;
        }
        do
        {
            if (view == null)
            {
                view = new View(c.getContext());
                view.setVisibility(8);
                return view;
            }
            if (i == 0)
            {
                view.getLayoutParams().height = b.getResources().getDimensionPixelSize(g.eO);
                view.setLayoutParams(view.getLayoutParams());
                view.setPadding(view.getPaddingLeft(), b.getResources().getDimensionPixelSize(g.eM), view.getPaddingRight(), 0);
                return view;
            }
            if (i == getCount() - 1)
            {
                view.getLayoutParams().height = b.getResources().getDimensionPixelSize(g.eO);
                view.setLayoutParams(view.getLayoutParams());
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), b.getResources().getDimensionPixelSize(g.eM));
                return view;
            } else
            {
                view.getLayoutParams().height = b.getResources().getDimensionPixelSize(g.eN);
                view.setLayoutParams(view.getLayoutParams());
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), 0);
                return view;
            }
        } while (true);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = ((View) (getItem(i)));
        TextView textview;
        if (view instanceof asa)
        {
            view = (asa)view;
        } else
        {
            view = null;
        }
        if (b.c == null)
        {
            b.c = c.inflate(g.hb, viewgroup, false);
        }
        viewgroup = (ImageView)b.c.findViewById(h.gr);
        textview = (TextView)b.c.findViewById(h.fG);
        if (view != null)
        {
            i = ((asa) (view)).b;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            viewgroup.setImageResource(com.google.android.apps.hangouts.R.drawable.bx);
            textview.setVisibility(8);
        } else
        if (g.e(i))
        {
            viewgroup.setImageResource(0);
            textview.setBackgroundResource(a(i));
            if (b.b)
            {
                i = l.ga;
            } else
            {
                i = l.ju;
            }
            textview.setText(i);
            textview.setVisibility(0);
        } else
        if (g.f(i))
        {
            TransportSpinner.a(b, viewgroup);
            textview.setText("");
            textview.setVisibility(8);
        } else
        {
            eev.g("Babel", "Unexpected variant");
        }
        return b.c;
    }
}
