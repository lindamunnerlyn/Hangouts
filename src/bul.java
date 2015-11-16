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

public final class bul extends hmk
    implements android.content.DialogInterface.OnClickListener
{

    public bul()
    {
    }

    static bul a(jhh jhh1)
    {
        Bundle bundle = new Bundle();
        bundle.putByteArray("key_participant", kws.toByteArray(jhh1));
        jhh1 = new bul();
        jhh1.setArguments(bundle);
        return jhh1;
    }

    private jhh q()
    {
        jhh jhh1;
        try
        {
            jhh1 = new jhh();
            kws.mergeFrom(jhh1, getArguments().getByteArray("key_participant"));
        }
        catch (kwr kwr1)
        {
            gdv.a("Invalid participant supplied to knocking dialog");
            a();
            return null;
        }
        return jhh1;
    }

    public Dialog a(Bundle bundle)
    {
        jhh jhh1 = q();
        if (jhh1 == null)
        {
            return null;
        }
        bundle = String.valueOf(jhh1.b);
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
        eev.c("Babel", bundle);
        g.b(1497);
        ai = getActivity();
        resources = ai.getResources();
        view = View.inflate(ai, g.mg, null);
        if (TextUtils.isEmpty(jhh1.c) && g.a(jhh1.n, 0) != 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        textview = (TextView)view.findViewById(g.me);
        bundle = jhh1.d;
        s = ((buh)hlp.a(getActivity(), buh)).c();
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
            bundle = resources.getString(h.hW, new Object[] {
                bundle, s
            });
        } else
        if (flag && flag1)
        {
            bundle = resources.getString(h.hX, new Object[] {
                bundle
            });
        } else
        if (flag1 && flag2)
        {
            bundle = resources.getString(h.hV, new Object[] {
                bundle, s
            });
        } else
        if (flag1)
        {
            bundle = resources.getString(h.hY, new Object[] {
                bundle
            });
        } else
        if (flag2)
        {
            bundle = resources.getString(h.hZ, new Object[] {
                s
            });
        } else
        {
            bundle = resources.getString(h.ia);
        }
        textview.setText(bundle);
        bundle = (AvatarView)view.findViewById(g.mb);
        if (flag)
        {
            bundle.setVisibility(8);
        } else
        {
            bundle.a(jhh1.e, jhh1.d, g.g());
            bundle.a(0);
            bundle.a();
            bundle.b();
        }
        bundle = (TextView)view.findViewById(g.mc);
        textview = (TextView)view.findViewById(g.md);
        if (!TextUtils.isEmpty(jhh1.x))
        {
            bundle.setText(resources.getString(h.hS));
            textview.setText(resources.getString(h.hR, new Object[] {
                jhh1.x
            }));
            bundle.setVisibility(0);
            textview.setVisibility(0);
        }
        b(false);
        return (new android.app.AlertDialog.Builder(ai)).setView(view).setPositiveButton(resources.getString(h.hN), this).setNegativeButton(resources.getString(h.hQ), this).setCancelable(false).create();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        buf buf1 = (buf)hlp.a(getActivity(), buf);
        jhh jhh1 = q();
        if (jhh1 == null)
        {
            return;
        }
        switch (i)
        {
        default:
            gdv.a("Unrecognized button click");
            return;

        case -1: 
            dialoginterface = String.valueOf(jhh1.b);
            if (dialoginterface.length() != 0)
            {
                dialoginterface = "Accept button clicked for knocking participant ".concat(dialoginterface);
            } else
            {
                dialoginterface = new String("Accept button clicked for knocking participant ");
            }
            eev.e("Babel", dialoginterface);
            g.b(1498);
            buf1.a(jhh1);
            return;

        case -2: 
            dialoginterface = String.valueOf(jhh1.b);
            break;
        }
        if (dialoginterface.length() != 0)
        {
            dialoginterface = "Reject button clicked for knocking participant ".concat(dialoginterface);
        } else
        {
            dialoginterface = new String("Reject button clicked for knocking participant ");
        }
        eev.e("Babel", dialoginterface);
        g.b(1499);
        buf1.b(jhh1);
    }

    public void onStart()
    {
        super.onStart();
        ((AlertDialog)c()).setCanceledOnTouchOutside(false);
    }
}
