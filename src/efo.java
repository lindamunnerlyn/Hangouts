// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class efo extends efj
    implements android.content.DialogInterface.OnClickListener
{

    private efk aj;
    private ArrayList an;

    public efo()
    {
        an = new ArrayList();
    }

    public static efj a(String s, List list)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putSerializable("list", new ArrayList(list));
        s = new efo();
        s.setArguments(bundle);
        return s;
    }

    static hlp a(efo efo1)
    {
        return efo1.al;
    }

    public Dialog a(Bundle bundle)
    {
        bundle = getArguments();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(ak);
        builder.setTitle(bundle.getString("title"));
        builder.setAdapter(new efp(this, ak, (List)bundle.getSerializable("list")), this);
        return builder.create();
    }

    public void a(efk efk1)
    {
        gdv.a("Listener should be set only once", aj);
        aj = efk1;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        aj.a();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        aj.a(i);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
    }
}
