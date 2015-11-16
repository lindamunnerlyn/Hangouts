// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.EditText;
import android.widget.TextView;

public class bfr extends hmk
    implements android.content.DialogInterface.OnClickListener
{

    public EditText aj;
    private bfs an;

    public bfr()
    {
    }

    public static bfr a(String s, String s1, String s2, String s3)
    {
        Bundle bundle = new Bundle();
        if (s != null)
        {
            bundle.putString("title", s);
        }
        bundle.putString("message", s1);
        if (s2 != null)
        {
            bundle.putString("positive", s2);
        }
        if (s3 != null)
        {
            bundle.putString("negative", s3);
        }
        s = new bfr();
        s.setArguments(bundle);
        return s;
    }

    private bfs q()
    {
        if (an != null)
        {
            return an;
        }
        Object obj = getTargetFragment();
        if (obj != null && (obj instanceof bfs))
        {
            return (bfs)obj;
        }
        obj = getActivity();
        if (obj != null && (obj instanceof bfs))
        {
            return (bfs)obj;
        } else
        {
            return null;
        }
    }

    public Dialog a(Bundle bundle)
    {
        bundle = getArguments();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        if (bundle.containsKey("title"))
        {
            builder.setTitle(bundle.getString("title"));
        }
        builder.setMessage(Html.fromHtml(bundle.getString("message")));
        if (bundle.containsKey("positive"))
        {
            builder.setPositiveButton(bundle.getString("positive"), this);
        }
        if (bundle.containsKey("negative"))
        {
            builder.setNegativeButton(bundle.getString("negative"), this);
        }
        if (bundle.containsKey("neutral"))
        {
            builder.setNeutralButton(bundle.getString("neutral"), this);
        }
        if (bundle.containsKey("edit_text"))
        {
            aj = new EditText(getActivity());
            aj.setText(bundle.getString("edit_text"));
            builder.setView(aj);
        }
        return builder.create();
    }

    public void a(bfs bfs1)
    {
        an = bfs1;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface = q();
        if (dialoginterface != null)
        {
            getArguments();
            dialoginterface.b(getTag());
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = q();
        if (dialoginterface == null)
        {
            return;
        }
        Bundle bundle = getArguments();
        if (bundle.containsKey("edit_text") && aj != null)
        {
            bundle.putString("edit_text", aj.getText().toString());
        }
        switch (i)
        {
        default:
            return;

        case -3: 
            getArguments();
            getTag();
            return;

        case -1: 
            dialoginterface.a(getArguments(), getTag());
            return;

        case -2: 
            getArguments();
            dialoginterface.a(getTag());
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        ((TextView)c().findViewById(0x102000b)).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
