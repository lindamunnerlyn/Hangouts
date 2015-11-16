// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;

public final class bty extends hhs
    implements android.content.DialogInterface.OnClickListener
{

    public bty()
    {
    }

    static bty a(jba jba1)
    {
        Bundle bundle = new Bundle();
        bundle.putByteArray("key_participant", kop.toByteArray(jba1));
        jba1 = new bty();
        jba1.setArguments(bundle);
        return jba1;
    }

    private jba q()
    {
        jba jba1;
        try
        {
            jba1 = new jba();
            kop.mergeFrom(jba1, getArguments().getByteArray("key_participant"));
        }
        catch (koo koo1)
        {
            gbh.a("Invalid participant supplied to knocking dialog");
            a();
            return null;
        }
        return jba1;
    }

    public Dialog a(Bundle bundle)
    {
        jba jba1 = q();
        if (jba1 == null)
        {
            return null;
        }
        bundle = String.valueOf(jba1.b);
        ai ai;
        Resources resources;
        View view;
        TextView textview;
        String s;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (bundle.length() != 0)
        {
            bundle = "Showing knocking dialog for participant ".concat(bundle);
        } else
        {
            bundle = new String("Showing knocking dialog for participant ");
        }
        ebw.c("Babel", bundle);
        g.b(1497);
        ai = getActivity();
        resources = ai.getResources();
        view = View.inflate(ai, g.ms, null);
        if (TextUtils.isEmpty(jba1.c) && g.a(jba1.n, 0) != 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        textview = (TextView)view.findViewById(g.mq);
        bundle = jba1.d;
        s = ((btu)hgx.a(getActivity(), btu)).c();
        if (!TextUtils.isEmpty(bundle))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!TextUtils.isEmpty(s))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag && flag1 && flag2)
        {
            bundle = resources.getString(h.ir, new Object[] {
                bundle, s
            });
        } else
        if (flag && flag1)
        {
            bundle = resources.getString(h.is, new Object[] {
                bundle
            });
        } else
        if (flag1 && flag2)
        {
            bundle = resources.getString(h.iq, new Object[] {
                bundle, s
            });
        } else
        if (flag1)
        {
            bundle = resources.getString(h.it, new Object[] {
                bundle
            });
        } else
        if (flag2)
        {
            bundle = resources.getString(h.iu, new Object[] {
                s
            });
        } else
        {
            bundle = resources.getString(h.iv);
        }
        textview.setText(bundle);
        bundle = (AvatarView)view.findViewById(g.mn);
        if (flag)
        {
            bundle.setVisibility(8);
        } else
        {
            bundle.a(jba1.e, jba1.d, g.h());
            bundle.a(0);
            bundle.a();
            bundle.b();
        }
        bundle = (TextView)view.findViewById(g.mo);
        textview = (TextView)view.findViewById(g.mp);
        if (!TextUtils.isEmpty(jba1.x))
        {
            bundle.setText(resources.getString(h.in));
            textview.setText(resources.getString(h.im, new Object[] {
                jba1.x
            }));
            bundle.setVisibility(0);
            textview.setVisibility(0);
        }
        b(false);
        return (new android.app.AlertDialog.Builder(ai)).setView(view).setPositiveButton(resources.getString(h.ii), this).setNegativeButton(resources.getString(h.il), this).setCancelable(false).create();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        bts bts1 = (bts)hgx.a(getActivity(), bts);
        jba jba1 = q();
        if (jba1 == null)
        {
            return;
        }
        switch (i)
        {
        default:
            gbh.a("Unrecognized button click");
            return;

        case -1: 
            dialoginterface = String.valueOf(jba1.b);
            if (dialoginterface.length() != 0)
            {
                dialoginterface = "Accept button clicked for knocking participant ".concat(dialoginterface);
            } else
            {
                dialoginterface = new String("Accept button clicked for knocking participant ");
            }
            ebw.e("Babel", dialoginterface);
            g.b(1498);
            bts1.a(jba1);
            return;

        case -2: 
            dialoginterface = String.valueOf(jba1.b);
            break;
        }
        if (dialoginterface.length() != 0)
        {
            dialoginterface = "Reject button clicked for knocking participant ".concat(dialoginterface);
        } else
        {
            dialoginterface = new String("Reject button clicked for knocking participant ");
        }
        ebw.e("Babel", dialoginterface);
        g.b(1499);
        bts1.b(jba1);
    }

    public void onStart()
    {
        super.onStart();
        ((AlertDialog)c()).setCanceledOnTouchOutside(false);
    }
}
