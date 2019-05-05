import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ege.customlistexample.R;

import java.util.List;

public class MyAdapter extends ArrayAdapter<OpSystem> {

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<OpSystem> objects) {
        super(context, android.R.layout.simple_list_item_1, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder= null;

        if(convertView==null)
        {
            LayoutInflater inflater=((Activity)getContext()).getLayoutInflater();
            convertView=inflater.inflate(R.layout.opsys_row_layout,parent);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else
            {
                viewHolder= (ViewHolder)convertView.getTag();
            }
        viewHolder.getImgView().setImageResource(getItem(position),getImageName());

        return super.getView(position, convertView, parent);
    }

    class ViewHolder
    {
        View base;

        public View getBase() {
            return base;
        }

        public ImageView getImgView() {
            if(imgView==null)
            {
                base.findViewById(R.id.imgopsys);
            }
            return imgView;
        }

        public TextView getTxtName() {
            if(txtName==null)
            {
                txtName= base.findViewById(R.id.txtname);
            }
            return txtName;
        }

        public TextView getTxtRating() {
            if(txtRating==null)
            {
                txtRating= base.findViewById(R.id.txtrating);
            }
            return txtRating;
        }

        ImageView imgView;
        TextView txtName;
        TextView txtRating;


        public ViewHolder(View base)
        {
            this.base=base;
        }

    }
}
