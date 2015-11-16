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

public final class bag extends ArrayAdapter
{

    final TransportSpinner a;
    private final LayoutInflater b;
    private boolean c;

    public bag(TransportSpinner transportspinner, Context context, int i)
    {
        a = transportspinner;
        super(context, i);
        b = LayoutInflater.from(context);
    }

    private static int a(int i)
    {
        if (i == 2)
        {
            return com.google.android.apps.hangouts.R.drawable.bD;
        } else
        {
            return com.google.android.apps.hangouts.R.drawable.bC;
        }
    }

    public static boolean a(bag bag1, boolean flag)
    {
        bag1.c = flag;
        return flag;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = getItem(i);
        if (obj instanceof ark)
        {
            view = b.inflate(g.fo, viewgroup, false);
            obj = (ark)obj;
            int i1 = ((ark) (obj)).b;
            Object obj1 = (ImageView)view.findViewById(h.cM);
            TextView textview = (TextView)view.findViewById(h.fY);
            TextView textview1 = (TextView)view.findViewById(h.gp);
            viewgroup = (TextView)view.findViewById(h.gl);
            if (g.e(i1))
            {
                ((ImageView) (obj1)).setImageResource(0);
                textview.setBackgroundResource(a(i1));
                int j;
                if (TransportSpinner.b(a))
                {
                    j = l.gr;
                } else
                {
                    j = l.kb;
                }
                textview.setText(j);
                textview.setVisibility(0);
                textview1.setText(ebz.p(((ark) (obj)).c));
                textview1.setTextColor(a.getResources().getColor(g.df));
                viewgroup.setVisibility(8);
                if (!TextUtils.isEmpty(((ark) (obj)).f) || c)
                {
                    obj = ((ark) (obj)).f;
                    viewgroup.setVisibility(0);
                    obj1 = new StringBuilder();
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        ((StringBuilder) (obj1)).append(((String) (obj)));
                        if (c)
                        {
                            ((StringBuilder) (obj1)).append(" ");
                        }
                    }
                    if (c)
                    {
                        ((StringBuilder) (obj1)).append("(").append(TransportSpinner.a(a, i1)).append(")");
                    }
                    viewgroup.setText(((StringBuilder) (obj1)).toString());
                }
                break MISSING_BLOCK_LABEL_289;
            } else
            {
                if (g.f(i1))
                {
                    TransportSpinner.a(a, ((ImageView) (obj1)));
                    textview.setVisibility(8);
                    if (!TextUtils.isEmpty(((ark) (obj)).c))
                    {
                        viewgroup.setText(((ark) (obj)).c);
                    } else
                    {
                        viewgroup.setText(((ark) (obj)).d);
                    }
                    textview1.setText(a.getResources().getString(l.eT));
                }
                continue;
            }
        } else
        {
            if (obj instanceof bah)
            {
                obj = (bah)obj;
                view = b.inflate(g.ft, viewgroup, false);
                viewgroup = (TextView)view.findViewById(h.gp);
                ImageView imageview = (ImageView)view.findViewById(h.cM);
                viewgroup.setText(((bah) (obj)).a());
                int k = ((bah) (obj)).b();
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
                view = new View(b.getContext());
                view.setVisibility(8);
                return view;
            }
            if (i == 0)
            {
                view.getLayoutParams().height = a.getResources().getDimensionPixelSize(g.eQ);
                view.setLayoutParams(view.getLayoutParams());
                view.setPadding(view.getPaddingLeft(), a.getResources().getDimensionPixelSize(g.eO), view.getPaddingRight(), 0);
                return view;
            }
            if (i == getCount() - 1)
            {
                view.getLayoutParams().height = a.getResources().getDimensionPixelSize(g.eQ);
                view.setLayoutParams(view.getLayoutParams());
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), a.getResources().getDimensionPixelSize(g.eO));
                return view;
            } else
            {
                view.getLayoutParams().height = a.getResources().getDimensionPixelSize(g.eP);
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
        if (view instanceof ark)
        {
            view = (ark)view;
        } else
        {
            view = null;
        }
        if (TransportSpinner.a(a) == null)
        {
            TransportSpinner.a(a, b.inflate(g.hj, viewgroup, false));
        }
        viewgroup = (ImageView)TransportSpinner.a(a).findViewById(h.gJ);
        textview = (TextView)TransportSpinner.a(a).findViewById(h.fY);
        if (view != null)
        {
            i = ((ark) (view)).b;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            viewgroup.setImageResource(com.google.android.apps.hangouts.R.drawable.bB);
            textview.setVisibility(8);
        } else
        if (g.e(i))
        {
            viewgroup.setImageResource(0);
            textview.setBackgroundResource(a(i));
            if (TransportSpinner.b(a))
            {
                i = l.gr;
            } else
            {
                i = l.kb;
            }
            textview.setText(i);
            textview.setVisibility(0);
        } else
        if (g.f(i))
        {
            TransportSpinner.a(a, viewgroup);
            textview.setText("");
            textview.setVisibility(8);
        } else
        {
            ebw.g("Babel", "Unexpected variant");
        }
        return TransportSpinner.a(a);
    }
}
