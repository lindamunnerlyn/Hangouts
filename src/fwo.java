// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;

public final class fwo
    implements android.os.Parcelable.Creator
{

    public fwo()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = g.a(parcel);
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    g.b(parcel, i1);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = g.e(parcel, i1);
                    break;

                case 3: // '\003'
                    k = g.e(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new DeleteDataItemsResponse(i, j, k);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new DeleteDataItemsResponse[i];
    }
}
