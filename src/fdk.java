// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.feedback.LogOptions;

public final class fdk
    implements android.os.Parcelable.Creator
{

    public fdk()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = g.a(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    s = g.i(parcel, k);
                    break;

                case 3: // '\003'
                    flag = g.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LogOptions(i, s, flag);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new LogOptions[i];
    }
}
