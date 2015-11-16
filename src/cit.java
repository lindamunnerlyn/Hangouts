// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.apps.hangouts.phone.AccountSelectionActivity;

final class cit
    implements android.os.Parcelable.Creator
{

    cit()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new AccountSelectionActivity();
    }

    public Object[] newArray(int i)
    {
        return new AccountSelectionActivity[i];
    }
}
