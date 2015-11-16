// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Spannable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class hla extends hmk
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnMultiChoiceClickListener
{

    private hlb aj;

    public hla()
    {
    }

    public static hla a(String s, CharSequence charsequence, String s1, String s2)
    {
        return (new hla()).a(s, charsequence, s1, s2, 0, 0);
    }

    private hlb r()
    {
        if (aj != null)
        {
            return aj;
        }
        if (getTargetFragment() instanceof hlb)
        {
            return (hlb)getTargetFragment();
        }
        if (getActivity() instanceof hlb)
        {
            return (hlb)getActivity();
        } else
        {
            return null;
        }
    }

    public Dialog a(Bundle bundle)
    {
        android.app.AlertDialog.Builder builder;
        Object obj;
        bundle = getArguments();
        obj = q();
        builder = new android.app.AlertDialog.Builder(((Context) (obj)));
        if (bundle.containsKey("title"))
        {
            builder.setTitle(bundle.getString("title"));
        }
        if (!bundle.containsKey("message")) goto _L2; else goto _L1
_L1:
        CharSequence charsequence = bundle.getCharSequence("message");
        TextView textview;
        obj = LayoutInflater.from(((Context) (obj))).inflate(g.tT, null);
        textview = (TextView)((View) (obj)).findViewById(l.uf);
        if (textview == null) goto _L4; else goto _L3
_L3:
        if (!(charsequence instanceof String)) goto _L6; else goto _L5
_L5:
        g.a(textview, (String)charsequence);
_L4:
        builder.setView(((View) (obj)));
_L2:
        if (bundle.containsKey("positive"))
        {
            builder.setPositiveButton(bundle.getString("positive"), this);
        }
        if (bundle.containsKey("negative"))
        {
            builder.setNegativeButton(bundle.getString("negative"), this);
        }
        if (bundle.containsKey("icon_attribute") && android.os.Build.VERSION.SDK_INT >= 11)
        {
            builder.setIconAttribute(bundle.getInt("icon_attribute"));
        } else
        if (bundle.containsKey("icon"))
        {
            builder.setIcon(bundle.getInt("icon"));
        }
        if (bundle.containsKey("list"))
        {
            builder.setItems(bundle.getStringArray("list"), this);
        }
        if (bundle.containsKey("multi_choice_list"))
        {
            charsequence = bundle.getStringArray("multi_choice_list");
            Exception exception;
            if (bundle.containsKey("multi_choice_list_states"))
            {
                bundle = bundle.getBooleanArray("multi_choice_list_states");
            } else
            {
                bundle = new boolean[charsequence.length];
            }
            builder.setMultiChoiceItems(charsequence, bundle, this);
        }
        return builder.create();
_L6:
        if (!(charsequence instanceof Spannable)) goto _L4; else goto _L7
_L7:
        g.a(textview, (Spannable)charsequence);
          goto _L4
        exception;
        Log.e("AlertFragmentDialog", "Cannot inflated view", exception);
        builder.setMessage(charsequence);
          goto _L2
    }

    protected hla a(String s, CharSequence charsequence, String s1, String s2, int i, int j)
    {
        Bundle bundle = new Bundle();
        if (s != null)
        {
            bundle.putString("title", s);
        }
        if (charsequence != null)
        {
            bundle.putCharSequence("message", charsequence);
        }
        if (s1 != null)
        {
            bundle.putString("positive", s1);
        }
        if (s2 != null)
        {
            bundle.putString("negative", s2);
        }
        setArguments(bundle);
        return this;
    }

    public void a(hlb hlb1)
    {
        aj = hlb1;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface = r();
        if (dialoginterface != null)
        {
            getArguments();
            getTag();
            dialoginterface.c();
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
label1:
            {
                dialoginterface = r();
                if (dialoginterface != null)
                {
                    switch (i)
                    {
                    default:
                        if (getArguments().containsKey("list") && i >= 0)
                        {
                            getTag();
                            dialoginterface.d();
                        }
                        break;

                    case -2: 
                        break label0;

                    case -1: 
                        break label1;
                    }
                }
                return;
            }
            getArguments();
            getTag();
            dialoginterface.a();
            return;
        }
        getArguments();
        getTag();
        dialoginterface.b();
    }

    public void onClick(DialogInterface dialoginterface, int i, boolean flag)
    {
        dialoginterface = r();
        if (dialoginterface != null && getArguments().containsKey("multi_choice_list") && i >= 0)
        {
            getTag();
            dialoginterface.e();
        }
    }

    public Context q()
    {
        return getActivity();
    }
}
