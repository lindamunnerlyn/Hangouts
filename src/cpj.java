// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.apps.hangouts.phone.SmsAccountPickerActivity;

final class cpj
    implements android.os.Parcelable.Creator
{

    cpj()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new SmsAccountPickerActivity();
    }

    public Object[] newArray(int i)
    {
        return new SmsAccountPickerActivity[i];
    }
}
