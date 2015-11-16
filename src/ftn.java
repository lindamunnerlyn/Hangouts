// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.people.model.AvatarReference;

public final class ftn
    implements android.os.Parcelable.Creator
{

    public ftn()
    {
    }

    public static AvatarReference a(Parcel parcel)
    {
        int j = 0;
        int k = g.a(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = g.e(parcel, l);
                    break;

                case 1000: 
                    i = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    s = g.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AvatarReference(i, j, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new AvatarReference[i];
    }
}
