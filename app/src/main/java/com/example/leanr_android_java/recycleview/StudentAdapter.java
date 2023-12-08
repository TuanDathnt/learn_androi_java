package com.example.leanr_android_java.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
//Co 2 cach de truyen du lieu vao adapter, dung contructor set get

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.leanr_android_java.R;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    //Tao ra item(view holder la 1 cai view de giu data)
    private List<Student> studentList= null;
    private OnItemClick onItemClick;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentAdapter(List<Student> studentList){
        this.studentList=studentList;
    }
    //C2 dung set de truyen du lieu vao adapter
    // Du lieu thuong se co sau khi chung ta khoi tao adapter
    //dung set se thich hop khi du lieu thay doi

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Tao ra mot cai view holder dung inflate
        //parent chinh la recycle view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student,parent,false);

        return new StudentViewHolder(view);
    }


    public StudentAdapter(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    //set cac du lieu can thiet cho view holder
    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        //c1
//        holder.tvName.setText(studentList.get(position).getName());
//        holder.tvAge.setText(studentList.get(position).getName());

        //C2
        holder.setData(studentList.get(position));
        holder.tvName.setOnClickListener(v -> {
            onItemClick.clickName(studentList.get(position).getName());
        });
        holder.itemView.setOnClickListener(v -> {
            onItemClick.clickItem();
        });
    }
    //Hien thi so luong item cac ban muon
    @Override
    public int getItemCount() {
        return studentList != null ? studentList.size() :0;
    }

    class StudentViewHolder extends RecyclerView.ViewHolder{
        private TextView tvName;
        private TextView tvAge;

        public StudentViewHolder(@NonNull View itemView){
            super(itemView);
            tvName=itemView.findViewById(R.id.tvName);
            tvAge =itemView.findViewById(R.id.tvAge);
        }
        public void setData(Student student){
            tvName.setText(student.getName());
            tvAge.setText(student.getAge()+"");

        }
    }
    public interface OnItemClick{
        void clickName(String name);
        void clickAge(String age);
        void clickItem();

    }
}
