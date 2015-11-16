// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

public final class bfj
    implements cib
{

    final com.google.android.apps.hangouts.fragments.BabelPhotoViewFragment.StoragePermissionHelperActivity a;

    public bfj(com.google.android.apps.hangouts.fragments.BabelPhotoViewFragment.StoragePermissionHelperActivity storagepermissionhelperactivity)
    {
        a = storagepermissionhelperactivity;
        super();
    }

    public void a(List list, Bundle bundle)
    {
        gbh.a(Integer.valueOf(list.size()), Integer.valueOf(1));
        list = (cic)list.get(0);
        gbh.a(((cic) (list)).a, "android.permission.WRITE_EXTERNAL_STORAGE");
        bundle = a;
        byte byte0;
        if (((cic) (list)).b)
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        bundle.setResult(byte0);
        a.finish();
    }
}
