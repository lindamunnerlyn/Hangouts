// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class cnt extends ac
{

    private Dialog aj;

    public cnt()
    {
    }

    public static cnt a(int i, int j)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", i);
        bundle.putInt("request_code", 1001);
        cnt cnt1 = new cnt();
        cnt1.setArguments(bundle);
        return cnt1;
    }

    public Dialog a(Bundle bundle)
    {
        int i = getArguments().getInt("error_code");
        int j = getArguments().getInt("request_code");
        aj = ejn.a(i, getActivity(), j);
        return aj;
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (aj == null)
        {
            f();
        }
        super.onActivityCreated(bundle);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a();
        getActivity().finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            a();
        }
    }
}
